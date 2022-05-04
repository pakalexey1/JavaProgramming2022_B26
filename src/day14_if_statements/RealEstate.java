package day14_if_statements;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {

        /*

        We are buying a house
        ask the user for their budget

        Find the area that the user's budget fits into and provide all the info on the neighborhood.

        extra condition: if the user gives a budget value below 0, it is invalid and so print "That is not a valid budget"

         */


        Scanner input = new Scanner(System.in);
        System.out.println("What's your budget?");
        int budget = input.nextInt();
        String name = "";
        String range = "";
        double rating = 0;
        boolean gated = true, allowPets = true;
        boolean toPrintOrNotToPrint = true;
        if (budget < 0 || budget >= 300000) {
            System.out.println("Budget can't be below zero or more than $300,000");
        } else {
            if (budget >= 80000 && budget <= 100000) {
                name = "Hills";
                range = "80000 - 100000";
                rating = 4.0;
                gated = false;
                allowPets = true;
            } else if (budget >= 55000 && budget <= 75000) {
                name = "Oaks";
                range = "55000 - 75000";
                rating = 3.5;
                gated = false;
                allowPets = true;
            } else if (budget >= 120000 && budget <= 150000) {
                name = "Highland";
                range = "120000 - 150000";
                rating = 4.5;
                gated = true;
                allowPets = false;
            } else if (budget >= 160000 && budget <= 201000) {
                name = "Canyon";
                range = "160000 - 201000";
                rating = 4.8;
                gated = true;
                allowPets = true;
            } else {
                System.out.println("No available houses for this budget");
                toPrintOrNotToPrint = false;
            }

            if (toPrintOrNotToPrint) {

                String ad = "Name of the neighborhood: " + name + "\nAverage price: " + range + "\nRating: " + rating;
                ad += "\nGated" + (gated ? ": Yes" : ": No");
                ad += "\n" + (allowPets ? "They allow pets" : "They don't allow pets");
                System.out.println(ad);
            }
        }
    }
}
