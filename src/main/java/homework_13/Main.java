package homework_13;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.generate(RandomUserProvider::generateUser)
                .limit(10)
                .filter(user -> user.getAge() > 3)
                .forEach(System.out::println);
    }

}
