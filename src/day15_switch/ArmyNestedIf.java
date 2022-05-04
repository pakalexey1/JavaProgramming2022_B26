package day15_switch;

import java.util.Scanner;

public class ArmyNestedIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Are you a citizen?");
        boolean citizen = input.nextBoolean();
        System.out.println("Are you a resident?");
        boolean resident = input.nextBoolean();
        System.out.println("What's your age?");
        int age = input.nextInt();
        System.out.println("Do you have a high-school diploma");
        boolean highSchool = input.nextBoolean();

        // boolean  citizen = true, resident = false, highSchool = false;
        // int age = 39;

       /* if (citizen||resident) {
            if (age>-18 && age <= 35) {
                if (highSchool){
                    System.out.println("You are qualified for the army");
                }else{
                    System.out.println("You must have a high school diploma");
                }
            } else {
                System.out.println("You must be between 18 and 35 years old");
            }
        } else {
            System.out.println("You must be a citizen");
        }*/

        //alternatively in one line:

        if  ((citizen||resident) && (age >=18 && age <=35) && (highSchool)) { // grouping parentheses are important
            System.out.println("You are eligible for the army");
        } else {
            if (!citizen && !resident) { // or the same result would be yielded from !(citizen && resident)
                System.out.println("You must be a resident");
            }
            if (!highSchool) {
                System.out.println("You must have a high school diploma");
            }
            if (age < 18 || age >35) {
                System.out.println("You must be between 18 and 35 years old");
            }
        }

    }
}
