package homework_3;

import java.math.BigDecimal;

public class SalaryCalculation {
    int hours = 8;
    int daysInMonth;
    int []month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        double [] arr = new double[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                arr[i] = Double.parseDouble(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter numbers, please!");
        }
        //double hourlyCost = arr[0];
        //double taxRate = arr[1];
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        salaryCalculation.salaryCalculation();

    }
    void salaryCalculation(){
        int k = 0;
        //for (int i = 0; i < 365; i++) {
            for (int j = 0; j < 31; j++) {
                for (int l = 0; l < 7; l++) {
                    if (l >= 0 && l < 5) {
                        k++;
                    }
                }
            }
        System.out.println(k);
       // }


    }
}
