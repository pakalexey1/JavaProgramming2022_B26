package day15_switch;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many days will you be staying at the hotel?");
        int days = input.nextInt();
        System.out.println("How many people are in your party?");
        int party=input.nextInt();

        String roomType = "";
        int price = 0;
        boolean isValid=true;

        switch (party){
            case 1:
                roomType="single room";
                price=100*days;
                break;
            case 2:
                roomType="double room";
                price=125*days;
                break;
            case 3:
            case 4:
                roomType="large room";
                price=150*days;
                break;
            case 5:
            case 6:
            case 7:
                roomType="suite";
                price=500*days;
                break;
            default:
                System.out.println("Sorry we don't have any available rooms for that size party");
                isValid=false;
        }
        if (isValid){
            System.out.println("Party size: "+party);
            System.out.println("Room type: "+ roomType);
            System.out.println("Price: $"+price);
        }
    }
}
