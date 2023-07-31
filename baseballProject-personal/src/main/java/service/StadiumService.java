package service;

import java.sql.SQLException;

public interface StadiumService {
    public void stadiumInsert(String name);
    public  void getAllStadium() throws SQLException;

}
