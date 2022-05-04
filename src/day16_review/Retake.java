package day16_review;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {
 /*
    create a class Retake
    declare and assign a grade variable
    declare and assign an attempt number

    Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:

        If its the first attempt -> subtract 10%
        If its the second attempt -> subtract 20%
        If its the third attempt -> subtract 35%
*/

        Scanner input = new Scanner (System.in);

        System.out.println("What's was your grade?");
        int grade = input.nextInt();
        System.out.println("Which attempt number is it?");
        int attempt = input.nextInt();
        boolean validAttempt = true;
        if (attempt == 1) {
            grade*=.9;
        }else if (attempt == 2) {
            grade*=.8;
        }else if (attempt == 3){
            grade*=.65;
        } else {
            System.out.println("Not a valid attempt number");
            validAttempt=false;
        }
        if (validAttempt){
            System.out.println("Your new max grade is: "+grade);
        }

    }

}
