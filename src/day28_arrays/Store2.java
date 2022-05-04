package day28_arrays;

import java.util.Scanner;

public class Store2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] stock = {"Shoes", "Jacket", "Gloves", "Airpods","iPad"};
        System.out.println("Which item are you looking for?");
        String item = input.nextLine();
        boolean inStock = false;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i].equalsIgnoreCase(item)){
                inStock=true;
                break;
            }
        }
        System.out.println(item + (inStock ? " is in stock" : " is not in stock")) ;
    }
}
