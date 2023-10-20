package homework_2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HourlyCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal salaryPerYearWithTaxes;
        BigDecimal workingHoursPerWeek;
        BigDecimal taxRate;
        double weeksAmount = 4.0;
        double monthsAmount = 12.0;
        try {
            System.out.println("Enter the number of working hours per week");
            workingHoursPerWeek = scanner.nextBigDecimal();
            System.out.println("Enter the salary per year with taxes");
            salaryPerYearWithTaxes = scanner.nextBigDecimal();
            System.out.println("Enter the tax rate (%)");
            taxRate = scanner.nextBigDecimal();
            hourlyCost(workingHoursPerWeek, salaryPerYearWithTaxes, taxRate, monthsAmount, weeksAmount);
        } catch (InputMismatchException e) {
            System.out.println("Write numbers, please!");
        } finally{
            scanner.close();
        }

    }

    public static void hourlyCost (BigDecimal workingHoursPerWeek, BigDecimal salaryPerYearWithTaxes, BigDecimal taxRate, double monthsAmount, double weeksAmount){
        BigDecimal coefficient = BigDecimal.valueOf(100.0).subtract(taxRate).multiply(BigDecimal.valueOf(0.01));
        BigDecimal salaryPerYearWithoutTaxes = salaryPerYearWithTaxes.divide(coefficient, 20, RoundingMode.HALF_UP);
        BigDecimal salaryPerMonthWithoutTaxes = salaryPerYearWithoutTaxes.divide(BigDecimal.valueOf(monthsAmount), 20, RoundingMode.HALF_UP);
        BigDecimal salaryPerWeek = salaryPerMonthWithoutTaxes.divide(BigDecimal.valueOf(weeksAmount));
        BigDecimal hourlyCost = salaryPerWeek.divide(workingHoursPerWeek);
        System.out.println("At " + workingHoursPerWeek  + " working hours per week with an annual salary of "
                + salaryPerYearWithTaxes + " tax rate of " + taxRate + "% an hour of time costs " + hourlyCost);
    }
}
