package day16_review;

import java.util.Scanner;

public class BloodDonation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your weight");
        int weight = input.nextInt();

        if (age>=18){
            if (weight>=50){
                System.out.println("You are eligible to donate blood");
            }else{
                System.out.println("You must weight 50kgs or more to donate blood");
            }

        }else{
            System.out.println("You must be 18 or older to donate blood");
        }

    }
}
