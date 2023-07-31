package model.outPlayer;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;
@Getter @Builder @AllArgsConstructor
public class OutPlayer {

    private int outplayerID;

    private int playerID;
    private String reason;
    private Timestamp createdAt;

}
