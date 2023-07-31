package model.player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;
@Getter @Builder @AllArgsConstructor
public class Player {

    private int playerID;
    private int teamID;
    private String name;
    private String position;
    private Timestamp createdAt;


}
