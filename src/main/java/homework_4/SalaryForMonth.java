package homework_4;

import java.math.BigDecimal;

public class SalaryForMonth {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        BigDecimal hourlyCost = new BigDecimal(args[1]);
        BigDecimal taxRate = new BigDecimal(args[2]);
        System.out.println("Salary for month without taxes: " + salaryPerMonth(workingDays(month),daySalary(hourlyCost)));
        System.out.println("Salary for month with taxes: " + salaryPerMonthWithTaxes(workingDays(month),daySalaryWithTaxes(hourlyCost,taxRate)));
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
