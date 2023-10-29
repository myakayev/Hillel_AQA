package homework_3;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Installment {
    BigDecimal creditSum;
    BigDecimal monthlyPercent;

       public static void main(String[] args) {
           Installment installment = new Installment();
           installment.credit();
    }

    void credit () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sum of credit");
        this.creditSum = scanner.nextBigDecimal();
        System.out.println("Enter the monthly percent on the loan balance");
        this.monthlyPercent =  scanner.nextBigDecimal();
        System.out.println("What do you want to calculate?\n" +
                "Enter '1' to calculate the number of monthly payments for full repayment of the credit\n" +
                "Enter '2' to calculate the sum of the monthly payment");
        Scanner scanner1 = new Scanner(System.in);
        String answer = scanner1.nextLine();
        if (answer.equals("1")) {
            System.out.println("The number of monthly payments: " + calculateNumberOfPayments());
        } else if (answer.equals("2")) {
            System.out.println("The sum of the monthly payment: " + calculateMonthlyPayment());
        } else System.out.println("Please enter '1' or '2'!");
        //scanner.close();
        //scanner1.close();
    }

    BigDecimal calculateNumberOfPayments() {  // кількість платежів, якщо відомо місячний платіж
           BigDecimal creditSum = this.creditSum;
           BigDecimal monthlyPercent = this.monthlyPercent.multiply(BigDecimal.valueOf(0.01));;
           BigDecimal monthlyPayment;
           BigDecimal numberOfPayments;
           BigDecimal one = new BigDecimal("1");
           System.out.println("Enter the amount of money you want to pay monthly");
           Scanner scanner = new Scanner(System.in);
           monthlyPayment = scanner.nextBigDecimal();
           BigDecimal j = monthlyPayment.divide((creditSum.multiply(monthlyPercent)), 200, RoundingMode.HALF_UP);
           BigDecimal k = j.subtract(one);
           BigDecimal l = one.divide(k,200,RoundingMode.HALF_UP);
           BigDecimal logVar = l.add(one);
           BigDecimal logBase = one.add(monthlyPercent);
           MathContext mc = new MathContext(10, RoundingMode.HALF_UP); // 100 знаків після коми
        // Обчислення логарифму за основою logBase
           BigDecimal numerator = new BigDecimal(Math.log(logVar.doubleValue()));
           BigDecimal denominator = new BigDecimal(Math.log(logBase.doubleValue()));
           numberOfPayments = numerator.divide(denominator, 2,RoundingMode.HALF_UP);
           return numberOfPayments.setScale(0, RoundingMode.CEILING);

    }
    BigDecimal calculateMonthlyPayment() { // місячний платіж, якщо відомо кількість платежів
        BigDecimal creditSum = this.creditSum;
        BigDecimal monthlyPercent = this.monthlyPercent.multiply(BigDecimal.valueOf(0.01));
        int numberOfPayments;
        BigDecimal monthlyPayment;
        BigDecimal one = new BigDecimal("1");
        System.out.println("Enter the number of payments");
        Scanner scanner = new Scanner(System.in);
        numberOfPayments = scanner.nextInt();
        BigDecimal k = (one.add(monthlyPercent)).pow(numberOfPayments).subtract(one);
        BigDecimal j = one.add(one.divide(k,20, RoundingMode.HALF_UP));
        monthlyPayment = creditSum.multiply(monthlyPercent).multiply(j);
        scanner.close();
        return monthlyPayment.setScale(2, RoundingMode.CEILING);
    }
}
