package homework_6;

import java.math.BigDecimal;

public class Employee {
    String name;
    String secondName;
    String position;
    BigDecimal hourlyCost;

    public Employee(String name, String secondName, String position, BigDecimal hourlyCost) {
        this.name = name;
        this.secondName = secondName;
        this.position = position;
        this.hourlyCost = hourlyCost;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setHourlyCost(BigDecimal hourlyCost) {
        this.hourlyCost = hourlyCost;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPosition() {
        return position;
    }

    public BigDecimal getHourlyCost() {
        return hourlyCost;
    }
    BigDecimal salaryPerMonth (int workingHoursPerWeek) {
        return hourlyCost.multiply(BigDecimal.valueOf(workingHoursPerWeek)).multiply(BigDecimal.valueOf(4.0));

    }
}
