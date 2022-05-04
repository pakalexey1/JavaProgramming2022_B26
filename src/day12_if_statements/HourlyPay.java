package day12_if_statements;

public class HourlyPay {
    public static void main(String[] args) {

        double hourlyRate = 10;
        double hoursWorked = 41;

        if (hoursWorked > 40) {
            System.out.println(40*hourlyRate+(hoursWorked-40)*(hourlyRate*1.5));
        } else {
            System.out.println(hourlyRate*hoursWorked);
        }

    }
}
