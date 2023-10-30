package homework_6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Credit {

    BigDecimal creditSum;
    BigDecimal monthlyPercent;
    int numberOfPayments;

    public Credit(BigDecimal creditSum, BigDecimal monthlyPercent, int numberOfPayments) {
        this.creditSum = creditSum;
        this.monthlyPercent = monthlyPercent;
        this.numberOfPayments = numberOfPayments;
    }

    public BigDecimal getCreditSum() {
        return creditSum;
    }

    public BigDecimal getMonthlyPercent() {
        return monthlyPercent;
    }

    public int getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(int numberOfPayments) { // на випадок, якщо клієнт хоче розрахуватись раніше
        this.numberOfPayments = numberOfPayments;
    }

    BigDecimal calculateMonthlyPayment() {
        BigDecimal monthlyPercent = this.monthlyPercent.multiply(BigDecimal.valueOf(0.01));
        BigDecimal monthlyPayment;
        BigDecimal one = new BigDecimal("1");
        BigDecimal k = (one.add(monthlyPercent)).pow(numberOfPayments).subtract(one);
        BigDecimal j = one.add(one.divide(k,20, RoundingMode.HALF_UP));
        monthlyPayment = creditSum.multiply(monthlyPercent).multiply(j);
        return monthlyPayment.setScale(2, RoundingMode.CEILING);
    }
}
