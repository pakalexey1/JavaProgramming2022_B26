package day15_switch;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the floor number");
        int floor = input.nextInt();

        switch (floor) {
            case 1:
                System.out.println("Floor "+floor+" --> Lobby, StarBucks, Amazon Pick Up");
                break;

            case 2:
                System.out.println("Floor "+floor+" --> NASA, Cydeo, Discover");
                break;

            case 3:
                System.out.println("Floor "+floor+" --> Uber, Lyft, Chase");
                break;

            case 4:
                System.out.println("Floor "+floor+" --> Rooftop, Lounge");
                break;
            default:
                System.out.println("Invalid Floor Selected");
        }
    }
}
