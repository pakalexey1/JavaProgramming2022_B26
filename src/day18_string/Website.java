package day18_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a website name");
        String webiste = input.nextLine();

        boolean correctStart = webiste.startsWith("www.");
        boolean correctEnd = webiste.endsWith(".com") || webiste.endsWith(".edu") || webiste.endsWith(".gov") || webiste.endsWith(".net");

        if (correctStart && correctEnd) {
            System.out.println("It's a valid website");

        } else {
            if (!correctStart) {
                System.out.println("The website start is invalid");
            }

            if (!correctEnd) {
                System.out.println("The website end is invalid");
            }
        }
    }
}
