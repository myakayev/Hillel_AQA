package homework_2;

public class Pow {
       public static void main(String[] args) {
           double doubleFirst;
           double doubleSecond;
        try {
            doubleFirst = Double.parseDouble(args[0]);
            doubleSecond = Double.parseDouble(args[1]);
            System.out.println(Math.pow(doubleFirst,doubleSecond));
        } catch (NumberFormatException e) {
            System.out.println("Write numbers, please!");
        }
    }
}