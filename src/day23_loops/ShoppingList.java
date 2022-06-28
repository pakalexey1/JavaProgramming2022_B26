package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "Shopping list:";
        String addmore;

        do {
            System.out.println("Enter the name of the item");
            list += "\n* "+input.nextLine();
            System.out.println("Do you want to add more to your Shopping list?");
            addmore = input.nextLine();;
        }while (addmore.equalsIgnoreCase("yes") || addmore.equalsIgnoreCase("y")); // if the user types 'yes' in the console about wanting to add more items, then the loop will iterate again

        // if the user types anyting besides 'yes' the equals method will give false and the loop will stop
        System.out.println(list);
    }
}
