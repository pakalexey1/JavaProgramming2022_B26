package day15_switch;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your grade");

        int grade = input.nextInt();

        String location = "", teacher = "";
        int numberOfGroups = 0;
        if (grade >= 1 && grade < +6) {
            if (grade == 1) {
                location = "Apple Orchard";
                numberOfGroups = 3;
                teacher = "Ms.Smith";
            } else if (grade == 2) {

            } else if (grade == 3) {

            } else if (grade == 4) {

            } else if (grade == 5) {

            } else {

            }
            System.out.println("Location: "+location);
            System.out.println("Number of Groups"+numberOfGroups);
            System.out.println("Teacher in charge: "+teacher);
        } else {
            System.out.println("Grade must be between 1 and 6");
        }

    }
}
