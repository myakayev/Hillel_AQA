package homework_4;

import java.math.BigDecimal;
import java.util.Scanner;

public class GoodPrice {
    public static void main(String[] args) {
        BigDecimal price = new BigDecimal(args[0]);
        System.out.println("Enter the amount of goods");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        scanner.close();
        System.out.println("The sum of purchase: " + sumOfGoods(price, discountCalculation(amount), amount));
    }

    static BigDecimal discountCalculation (int amount) {
        BigDecimal i = BigDecimal.valueOf(0.4);
        BigDecimal discount = BigDecimal.valueOf(12);
        if (amount > 80) return BigDecimal.valueOf(13);
        else if (amount > 30) {
            while (amount >= 40) {
                    amount -= 10;
                    discount = discount.add(i);
            }
            return discount;
        }
        else if (amount > 20) return BigDecimal.valueOf(10);
        else if (amount > 10) return  BigDecimal.valueOf(5);
        else return BigDecimal.valueOf(0);
    }
    static BigDecimal sumOfGoods (BigDecimal price, BigDecimal discount, int amount) {
        discount = discount.multiply(BigDecimal.valueOf(0.01));
        BigDecimal discountPrice = price.multiply((BigDecimal.valueOf(1).subtract(discount)));
        return discountPrice.multiply(BigDecimal.valueOf(amount));
    }
}
