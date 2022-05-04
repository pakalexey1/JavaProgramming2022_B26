package day06_RecapOfDay05;

import java.sql.SQLOutput;

public class SalaryCalculator {
    public static void main(String[] args) {

        int salary=100_001;
        double stateTaxRate=0.05;
        double federalTaxRate=0.25;
        double stateTax=salary*stateTaxRate;
        double federalTax=salary*federalTaxRate;
        double salaryAfterTax = salary-stateTax-federalTax;

        System.out.println("State tax rate: "+stateTaxRate);
        System.out.println("Federal tax rate: "+federalTaxRate);
        System.out.println("Pre tax salary "+salary);
        System.out.println("State tax paid: "+stateTax);
        System.out.println("Federal tax paid: "+federalTax);
        System.out.println("Salary after taxes paid: "+salaryAfterTax);

    }

}
