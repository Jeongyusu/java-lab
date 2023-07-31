package db;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DBInitTest {

    @Test
    public void init_test(){
        DBInit dbInit = new DBInit();
        String sql = dbInit.readTeardown();

        try {
            Connection connection = DBConnection.getInstance();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
