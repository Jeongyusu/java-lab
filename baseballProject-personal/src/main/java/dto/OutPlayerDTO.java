package dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class OutPlayerDTO {

    private int pId;
    private String pName;
    private String pPosition;
    private String oReason;
    private Timestamp oDay;
}
