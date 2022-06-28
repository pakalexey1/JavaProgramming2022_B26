package day40_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();
        System.out.println(shoppingList.isEmpty());

        System.out.println(shoppingList.isEmpty() ? "Shopping List Empty" : "You have some items");
        String keepAsking;
        do {
            System.out.println("Enter the item");
            shoppingList.add(input.nextLine());

            System.out.println("Do you want to continue yes/no?");
            keepAsking = input.nextLine();
        } while (keepAsking.equalsIgnoreCase("yes") || keepAsking.equalsIgnoreCase("y"));

        System.out.println("Shopping List:" + shoppingList.size() + " items:");
        for (String item : shoppingList) {
            System.out.println("*\t" + item);
        }
        System.out.println("---------------------------");

        System.out.println(shoppingList.contains("water") ? "Water on the list" : "No water on the list");

        System.out.println("Do you want to remove any items?");
        if (input.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("What item do you want to remove?");
            String removeItem = input.nextLine(); // will be either an item name or item number

            if (Character.isDigit(removeItem.charAt(0))) {//checks the first character of remove item is a number
                int numberToRemove = Integer.parseInt(removeItem) - 1; // -1 to con
                shoppingList.remove(numberToRemove);
            } else {
                shoppingList.remove(removeItem);
            }
            System.out.println(removeItem + " removed from the Shopping List");
            System.out.println("Updated Shopping List:" + shoppingList.size() + " items:");
            for (String item : shoppingList) {
                System.out.println("*\t" + item);
            }
            System.out.println("---------------------------");

        }
    }
}
