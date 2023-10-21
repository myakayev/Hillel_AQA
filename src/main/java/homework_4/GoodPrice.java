package homework_4;

import java.util.Scanner;

public class GoodPrice {
    public static void main(String[] args) {
        //double price = Double.parseDouble(args[0]);
        System.out.println("Enter the amount of goods");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        scanner.close();
        System.out.println(discountCalculation(amount));
    }

    static  double discountCalculation (int amount) {
        double i = 0.2;
        double discount = 12;
        if (amount >= 80) return 13;
        if (amount > 30 && amount <= 80) {
            while ((amount - 30) == 0) {
                if (amount >= 31) {
                    amount -= 10;
                    i += 0.2;
                    discount += i;
                } else return discount;
            }
            return discount;
        }
        else if (amount > 20) return 10;
        else if (amount > 10) return  5;
        else return 0;
    }
}
