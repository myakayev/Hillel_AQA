package homework_13;

import com.github.javafaker.Faker;
import lombok.ToString;

public class RandomUserProvider {
    static Faker faker = new Faker();
    public static User generateUser() {
        return User.builder()
                .age(generateRandomAge())
                .name(faker.name().firstName())
                .email(faker.internet().emailAddress())
                .gender(generateRandomGender())
                .build();
    }

    private static int generateRandomAge(){
        return (int) (Math.random() * 10);
    }

    public static String generateRandomGender() {
        Faker faker = new Faker();
        String name = faker.name().firstName();
        char lastLetter = name.charAt(name.length() - 1);
        String gender = (lastLetter % 2 == 0) ? "Male" : "Female";

        return gender;
    }
}
