package day15_switch;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month number");
        int monthNo = input.nextInt();

        String season = "";
        String message = "";
        boolean isValid = true;

        switch (monthNo) {

            case 12:
            case 1:
            case 2:
                season = "winter";
                message = ", so wear a winter coat, gloves and a hat";
                break;

            case 3:
            case 4:
            case 5:
                season = "spring";
                message = ", so wear something not too warm and not oold";
                break;

            case 6:
            case 7:
            case 8:
                season = "summer";
                message = ", so wear nothing";
                break;

            case 9:
            case 10:
            case 11:
                season = "fall";
                message = ", so wear something";
                break;

            default:
                System.out.println("Invalid month name");
                isValid=false;
        }
        if (isValid) {
            System.out.println("It is " + season + message);
        }

    }
}
