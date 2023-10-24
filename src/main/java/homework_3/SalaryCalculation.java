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
    static BigDecimal daySalary (BigDecimal hourlyCost) {
        return hourlyCost.multiply(BigDecimal.valueOf(8.0));
    }

    static BigDecimal daySalaryWithTaxes (BigDecimal hourlyCost, BigDecimal taxRate) {
        BigDecimal salaryPerDay = hourlyCost.multiply(BigDecimal.valueOf(8.0));
        BigDecimal taxAmount = salaryPerDay.multiply(taxRate).multiply(BigDecimal.valueOf(0.01));
        return salaryPerDay.subtract(taxAmount);
    }
    static BigDecimal salaryPerMonth (int workingDays, BigDecimal daySalary) {
        return daySalary.multiply(BigDecimal.valueOf(workingDays));
    }

    static BigDecimal salaryPerMonthWithTaxes (int workingDays, BigDecimal daySalaryWithTaxes) {
        return daySalaryWithTaxes.multiply(BigDecimal.valueOf(workingDays));
    }

    static int workingDays (int month) {
        int workingDays = 0;
        int k = 0;
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < months[month - 1]; i++) {
            k++;
            if (k <= 5) workingDays++;
            if (k == 7) k = 0;
        }
        return workingDays;
    }

}

