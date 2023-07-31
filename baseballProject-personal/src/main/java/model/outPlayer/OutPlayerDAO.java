package model.outPlayer;

import dto.OutPlayerDTO;
import model.player.Player;
import service.OutPlayerService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OutPlayerDAO implements OutPlayerService {

    private Connection connection;

    public OutPlayerDAO(Connection connection) {
        this.connection = connection;
    }



    public void outPlayerInsertAndNullUpdate(int playerID, String reason){
        outplayerInsert(playerID, reason);
        outplayerNullUpdate(playerID);
    }


    public void outplayerInsert(int playerID, String reason) {
        String query = "INSERT INTO out_player(player_id, reason, created_at) VALUES( ?, ?, now())";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, playerID);
            statement.setString(2, reason);
            statement.executeUpdate();
            System.out.println("성공");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void outplayerNullUpdate(int playerID) {
        String query = "UPDATE player SET team_id = null WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, playerID);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public void getAllPlayersDebidebyOut() {
        List<OutPlayerDTO> outPlayerDTOList = new ArrayList<>();
        String query = "select \n" +
                "pr.id p_id,\n" +
                "pr.name p_name,\n" +
                "pr.position p_position,\n" +
                "op.reason o_reason,\n" +
                "op.created_at o_day\n" +
                "from player pr\n" +
                "left outer join out_player op on op.player_id = pr.id;";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    OutPlayerDTO outPlayerDTO = buildAllPlayersDebidebyOut(resultSet);
                    outPlayerDTOList.add(outPlayerDTO);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (OutPlayerDTO outplayerDTO:outPlayerDTOList) {
            System.out.println(outplayerDTO.getPId() + outplayerDTO.getPName() + outplayerDTO.getPPosition() + outplayerDTO.getOReason() + outplayerDTO.getODay());

        }


    }

    private OutPlayerDTO buildAllPlayersDebidebyOut(ResultSet resultSet) throws SQLException {
        int pId = resultSet.getInt("p_id");
        String pName = resultSet.getString("p_name");
        String pPosition = resultSet.getString("p_position");
        String oReason = resultSet.getString("o_reason");
        Timestamp oDay = resultSet.getTimestamp("o_day");
        return OutPlayerDTO.builder().pId(pId)
                .pName(pName)
                .pPosition(pPosition)
                .oDay(oDay)
                .oReason(oReason)
                .build();
    }
}