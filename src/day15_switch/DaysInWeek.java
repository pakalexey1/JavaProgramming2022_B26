package day15_switch;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7");
        int day = input.nextInt();
        String dayName = "";
        switch (day) {
            case 1:
                dayName="Monday";
                break;
            case 2:
                dayName="Tueday";
                break;
            case 3:
                dayName="Wednesday";
                break;
            case 4:
                dayName="Thursday";
                break;
            case 5:
                dayName="Friday";
                break;
            case 6:
                dayName="Saturday";
                break;
            case 7:
                dayName="Sunday";
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println(dayName);
    }
}
