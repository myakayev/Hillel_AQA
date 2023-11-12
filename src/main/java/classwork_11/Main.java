package classwork_11;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("Vasya", "Red");
        Horse horse1 = new Horse("Vasya", "Red");
        System.out.println(horse.equals(horse1));
        System.out.println(horse.toString());
    }
}
