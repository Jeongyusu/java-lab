package model.team;

import dto.TeamRespDTO;
import model.stadium.Stadium;
import service.TeamService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeamDAO implements TeamService {
    private Connection connection;

    public TeamDAO(Connection connection) {
        this.connection = connection;
    }

    public void teamInsert(int stadiumId, String name) {
        String query = "INSERT INTO team(stadium_id, name, created_at) VALUES(?, ?, now())";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, stadiumId);
            statement.setString(2, name);
            statement.executeUpdate();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getAllTeam() {
        List<TeamRespDTO> teamRespDTOList = new ArrayList<>();
        String query = "select\n" +
                "tm.name '구단명',\n" +
                "sm.name '경기장'\n" +
                "from team tm\n" +
                "left outer join stadium sm on tm.id = sm.id;";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                TeamRespDTO teamRespDTO = buildTeamFromResultSet(resultSet);
                teamRespDTOList.add(teamRespDTO);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (TeamRespDTO teamRespDTO : teamRespDTOList) {
            System.out.println(teamRespDTO.getTeamName() + teamRespDTO.getStadiumName());
        }


    }


    private TeamRespDTO buildTeamFromResultSet(ResultSet resultSet) throws SQLException {
        String teamName = resultSet.getString("구단명");
        String stadiumname = resultSet.getString("경기장");

        return TeamRespDTO.builder().teamName(teamName)
                .stadiumName(stadiumname)
                .build();
    }

}
