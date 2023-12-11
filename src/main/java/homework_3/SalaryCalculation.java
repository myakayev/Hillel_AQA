package homework_3;

import java.math.BigDecimal;
import java.util.Arrays;

public class SalaryCalculation {
    int hours = 8;
    int daysInMonth;
    int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        BigDecimal hourlyCost = new BigDecimal(args[0]);
        BigDecimal taxRate = new BigDecimal(args[1]);
        System.out.println(Arrays.toString(workingDaysForEachMonth()));
        //  System.out.println("Salary for month without taxes: " + salaryPerMonth(workingDays(month),daySalary(hourlyCost)));
        // System.out.println("Salary for month with taxes: " + salaryPerMonthWithTaxes(workingDays(month),daySalaryWithTaxes(hourlyCost,taxRate)));

    }

    static BigDecimal daySalary(BigDecimal hourlyCost) {
        return hourlyCost.multiply(BigDecimal.valueOf(8.0));
    }

    static BigDecimal daySalaryWithTaxes(BigDecimal hourlyCost, BigDecimal taxRate) {
        BigDecimal salaryPerDay = hourlyCost.multiply(BigDecimal.valueOf(8.0));
        BigDecimal taxAmount = salaryPerDay.multiply(taxRate).multiply(BigDecimal.valueOf(0.01));
        return salaryPerDay.subtract(taxAmount);
    }


    static int[] workingDaysForEachMonth() {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] workingDaysForEachMonth = new int[12];
        int k = 0;
        for (int i = 0; i < 12 ; i++) {
            int workingDays = 0;
            for (int j = 0; j < months[i] ; j++) {
                k++;
                if (k <= 5) workingDays++;
                if (k == 7) k = 0;
            }
            workingDaysForEachMonth[i] = workingDays;
        }
        return workingDaysForEachMonth;
    }

    static BigDecimal[] salaryForEachMonth(int[] workingDaysForEachMonth, BigDecimal daySalary) {
        BigDecimal[] salaryForEachMonth = new BigDecimal[workingDaysForEachMonth.length];
        for (int i = 0; i < workingDaysForEachMonth.length; i++) {
            salaryForEachMonth[i] = daySalary.multiply(BigDecimal.valueOf(workingDaysForEachMonth[i]));

        }
        return salaryForEachMonth;
    }

    static  BigDecimal[] salaryForEachMonthWithTaxes(int[] workingDaysForEachMonth, BigDecimal daySalaryWithTaxes) {
        BigDecimal[] salaryForEachMonth = new BigDecimal[workingDaysForEachMonth.length];
        for (int i = 0; i < workingDaysForEachMonth.length; i++) {
            salaryForEachMonth[i] = daySalaryWithTaxes.multiply(BigDecimal.valueOf(workingDaysForEachMonth[i]));

        }
        return salaryForEachMonth;
    }

}

