package day10_scanner;

import java.util.Scanner;

public class RateCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your  salary");
        double salary = input.nextDouble();
        System.out.println("How many hours did you work in a week?");
        int hoursInWeek = input.nextInt();

        double hourlyRate = salary/(hoursInWeek*52);

        System.out.println(hourlyRate);
    }
}

