package model.stadium;

import service.StadiumService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StadiumDAO implements StadiumService{

    private Connection connection;

    public StadiumDAO(Connection connection) {
        this.connection = connection;
    }

    public void stadiumInsert(String name){
        String query = "INSERT INTO stadium(name, created_at) VALUES(?, now())";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.executeUpdate();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public  void getAllStadium() throws SQLException{
        List<Stadium> stadiumList = new ArrayList<>();
        String query = "SELECT * FROM stadium";
        ResultSet resultset = null;
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(query);
            resultset = statement.executeQuery();
            while(resultset.next()) {
                Stadium stadium = buildStadiumFromResultSet(resultset);
                stadiumList.add(stadium);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }finally {
            resultset.close();
            statement.close();
        }

        for (Stadium stadium: stadiumList)
            System.out.println(stadium.getStadiumID() + "번 경기장 : " + stadium.getName() + "    연도 : " + stadium.getCreatedAt() );
        {

        }

    }

    private Stadium buildStadiumFromResultSet(ResultSet resultSet) throws SQLException {
        int stadiumID = resultSet.getInt("id");
        String name = resultSet.getString("name");
        Timestamp createdAt = resultSet.getTimestamp("created_at");

        return Stadium.builder().stadiumID(stadiumID)
                .name(name)
                .createdAt(createdAt)
                .build();

    }

}
