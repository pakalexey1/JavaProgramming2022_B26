package day33_methods;

import java.util.Scanner;

public class Age {
    public static void age (int years){
        System.out.println("You are "+(2022-years)+" old");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What year were you born?");
        int yearBorn = input.nextInt();
        age(yearBorn);

    }
}


/* make a method that calculates and prints the age
it takes the birth year as an input
 */