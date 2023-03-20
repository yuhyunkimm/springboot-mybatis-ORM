package shop.mtcoding.mybatisdto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class BoardDetailOutDto {
    private Integer id;
    private String title;
    private String content;
    private Timestamp createdAt;
    private Integer userid;
    private String userUsername;
    private String userPassword;
    private String userEmail;
    private Timestamp userCreatedAt;
}
