package homework_2;//package org.example;
import java.math.BigDecimal;
public class Salary {
    public static void main(String[] args) {
        BigDecimal workingHoursPerWeek;
        BigDecimal hourlyCost;
        BigDecimal taxRate;
        BigDecimal taxAmount;
        BigDecimal salaryPerMonthWithoutTaxes;
        BigDecimal salaryPerMonthWithTaxes;
        BigDecimal salaryPerYearWithTaxes;
        BigDecimal salaryPerYearWithoutTaxes;

        try {
            workingHoursPerWeek =  new BigDecimal(args[0]);
            hourlyCost = new BigDecimal(args[1]);
            taxRate = new BigDecimal(args[2]);
            salaryPerMonthWithoutTaxes = hourlyCost.multiply(workingHoursPerWeek).multiply(BigDecimal.valueOf(4.0));
            taxAmount = salaryPerMonthWithoutTaxes.multiply(taxRate).multiply(BigDecimal.valueOf(0.01));
            salaryPerMonthWithTaxes = salaryPerMonthWithoutTaxes.subtract(taxAmount);
            salaryPerYearWithoutTaxes = salaryPerMonthWithoutTaxes.multiply(BigDecimal.valueOf(12.0));
            salaryPerYearWithTaxes = salaryPerMonthWithTaxes.multiply(BigDecimal.valueOf(12.0));
            System.out.println("Salary per month without taxes: " + salaryPerMonthWithoutTaxes);
            System.out.println("Salary per month with taxes: " + salaryPerMonthWithTaxes);
            System.out.println("Salary per year without taxes: " + salaryPerYearWithoutTaxes);
            System.out.println("Salary per year with taxes: " + salaryPerYearWithTaxes);
        } catch (NumberFormatException e) {
            System.out.println("Write numbers, please!");
        }
    }
}
