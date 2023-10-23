package homework_3;

import java.math.BigDecimal;

public class SalaryCalculation {
    int hours = 8;
    int daysInMonth;
    int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        double[] arr = new double[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                arr[i] = Double.parseDouble(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter numbers, please!");
        }

    }

}

