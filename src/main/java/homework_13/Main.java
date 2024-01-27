package homework_13;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> groupedByGender = Stream.generate(RandomUserProvider::generateUser)
                .limit(20)
                .filter(user -> user.getAge() > 18)
                .filter(user -> Objects.equals(user.getEmail(), ""))
                .collect(Collectors.groupingBy(User::getGender,
                        Collectors.mapping(User::getName, Collectors.toList())));
        System.out.println(groupedByGender);

    }
}
