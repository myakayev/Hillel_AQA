package homework_13;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    String name;
    int age;
    String email;
    String gender;
}
