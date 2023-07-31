package model.stadium;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;

@Getter @AllArgsConstructor @Builder
public class Stadium {
    private int stadiumID;
    private String name;
    private Timestamp createdAt;


}
