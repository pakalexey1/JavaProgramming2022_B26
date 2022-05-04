package day15_switch;

import java.util.Scanner;

public class DayInMonthSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a month name");
        String month = input.next();
        String days = "";

        switch (month){

            case "February":
                days=("28 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                days=("30 days");
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "Decemeber":
                days=("31 days");
                break;
            default:
                System.out.println("Invalid month name");
        }
        System.out.println("There are "+days+" in "+month);

    }
}
