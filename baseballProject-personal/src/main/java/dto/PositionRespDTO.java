package dto;

import lombok.*;

import java.sql.Connection;
@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class PositionRespDTO {

    public String position;
    public String teamName1;
    public String teamName2;
    public String teamName3;



}
