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
        BigDecimal daySalary = daySalary(hourlyCost);
        BigDecimal daySalaryWithTaxes = daySalaryWithTaxes(hourlyCost, taxRate);
        BigDecimal[] salaryForEachMonth = salaryForEachMonth(workingDaysForEachMonth(), daySalary);
        BigDecimal[] salaryForEachMonthWithTaxes = salaryForEachMonthWithTaxes(workingDaysForEachMonth(), daySalaryWithTaxes);
        for (String element:salaryCalculation(salaryForEachMonthWithTaxes,salaryForEachMonth)) {
            System.out.println(element);
        }
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

    static String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
    
    static String[] salaryCalculation (BigDecimal[] salaryForEachMonthWithTaxes, BigDecimal[] salaryForEachMonth){
        String[] finalArray = new String[13];
        for (int i = 0; i < 12; i++) {
            finalArray[i] = months[i] + " " + salaryForEachMonthWithTaxes[i].toString() + " " +
                    salaryForEachMonth[i].toString();
            finalArray[12] = "TOTAL: " + sum(salaryForEachMonthWithTaxes) + " " + sum(salaryForEachMonth);
        }
        return finalArray;
    }

    static BigDecimal sum (BigDecimal[] array) {
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal number : array) {
            sum = sum.add(number);
        }
        return sum;
    }


}

