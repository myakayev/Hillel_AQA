package classwork_29;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class TokenModel {
    private String token;
    private String result;
    private String status;
    private String expires;
    private  String statusCode;


}
