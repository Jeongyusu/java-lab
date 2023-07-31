package model.player;

import dto.PositionRespDTO;
import model.stadium.Stadium;
import service.PlayerSerivce;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO implements PlayerSerivce {

    private Connection connection;

    public PlayerDAO(Connection connection) {
        this.connection = connection;
    }

    public void playerInsert(int teamId, String name, String position) {
        String query = "INSERT INTO player(team_id, name, position, created_at) VALUES(?, ?, ?,now())";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, teamId);
            statement.setString(2, name);
            statement.setString(3, position);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("성공");

    }

    public void getPlayerByTeam(int teamId) {
        List<Player> playerList = new ArrayList<>();
        String query = "SELECT * FROM player WHERE team_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, teamId);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Player player = buildPlayerbyTeamFromResultSet(resultSet);
                    playerList.add(player);
                }
            }
            System.out.println("성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Player player : playerList) {
            System.out.println(player.getPlayerID() + player.getName() + player.getPosition() + player.getCreatedAt());

        }

    }

    public void getPlayerbyPosition() {
        List<PositionRespDTO> positionRespDTOList = new ArrayList<>();
        String query = "select \n" +
                "pr.position '포지션',\n" +
                "MAX(if(tm.id = 1, pr.name, null)) '롯데',\n" +
                "MAX(if(tm.id = 2, pr.name, null)) 'SK',\n" +
                "MAX(if(tm.id = 3, pr.name, null)) 'NC'\n" +
                "from player pr\n" +
                "left outer join team tm on pr.team_id = tm.id\n" +
                "group by pr.position";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    PositionRespDTO positionRespDTO = buildgetPlayerbyPosition(resultSet);
                    positionRespDTOList.add(positionRespDTO);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (PositionRespDTO positionRespDTO:positionRespDTOList) {
            System.out.println(positionRespDTO.getPosition() + positionRespDTO.getTeamName1() + positionRespDTO.getTeamName2() + positionRespDTO.getTeamName3());

        }

    }

    private Player buildPlayerbyTeamFromResultSet(ResultSet resultSet) throws SQLException {
        int playerID = resultSet.getInt("id");
        int teamID = resultSet.getInt("team_id");
        String name = resultSet.getString("name");
        String position = resultSet.getString("position");
        Timestamp createdAt = resultSet.getTimestamp("created_at");
        return Player.builder().playerID(playerID)
                .teamID(teamID)
                .name(name)
                .position(position)
                .createdAt(createdAt)
                .build();


    }

    private PositionRespDTO buildgetPlayerbyPosition(ResultSet resultSet) throws SQLException {
        String position = resultSet.getString("포지션");
        String teamName1 = resultSet.getString("롯데");
        String teamName2 = resultSet.getString("SK");
        String teamName3 = resultSet.getString("NC");
        return PositionRespDTO.builder().position(position)
                .teamName1(teamName1)
                .teamName2(teamName2)
                .teamName3(teamName3)
                .build();


    }

}


