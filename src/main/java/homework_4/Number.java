package homework_4;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Enter number!");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        whatIsNumber(number);

    }
    static void whatIsNumber (String data){
        int number;
        String parityCheck;
        String positiveCheck;
        String primeCheck = "not natural";
        try {
            number = Integer.parseInt(data);
            if (number % 2 == 0) parityCheck = "even\n"; else parityCheck = "odd\n";
            if (number < 0) positiveCheck = "negative\n";
            else if (number == 0) {
                positiveCheck = "it's zero\n";
            } else {
                positiveCheck = "positive\n";
                if(isPrime(number)) primeCheck = "prime\n";
                else primeCheck = "compound\n";
            }
            System.out.println("The number is:\n" +
                    parityCheck + positiveCheck + primeCheck);

        } catch (NumberFormatException e) {
            System.out.println("It's not an integer number!");
        }
        
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true; // 2 і 3 - прості числа
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false; // число, що ділиться на 2 або 3, не є простим
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false; // якщо число ділиться на i або i + 2, то воно не є простим
            }
        }
        return true; // інакше число є простим
    }
}
