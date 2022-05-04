package day10_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 angele values");
        double angle1=input.nextDouble();
        double angle2=input.nextDouble();
        double angle3=input.nextDouble();

        boolean isTriangle = angle1 + angle2 + angle3 == 180;
        boolean isCircle = angle1 + angle2 + angle3 == 360;

        System.out.println("is a triangle: " + isTriangle );
        System.out.println("is a circle: " + isCircle);


    }
}
