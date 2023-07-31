package model.team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;

@Getter @Builder @AllArgsConstructor
public class Team {
    private int TeamID;
    private int stadiumID;
    private String name;
    private Timestamp createdAt;



}
