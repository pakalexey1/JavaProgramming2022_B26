package day15_switch;

import java.util.Scanner;

public class BookSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose the genre");
        String genre = input.nextLine();
        int pagelength = 0;
        int profit = 0;
        int sequels = 0;
        int countries = 0;
        boolean isValid=true;
        switch (genre) {
            case "Fantasy":
                pagelength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;
            case "Detective":
                pagelength = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;
            case "Science Fiction":
                pagelength = 720;
                profit = 900_000;
                sequels = 4;
                countries = 30;
                break;
            case "Short Story":
                pagelength = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                break;
            default:
                System.out.println("Invalid genre");
                isValid=false;
        }
        if (isValid){
            System.out.println("Genre: "+genre);
            System.out.println("Page Length: "+pagelength);
            System.out.println("Profit: "+profit);
            System.out.println("Sequels: "+sequels);
            System.out.println("Countries: "+countries);
        }


    }
}
