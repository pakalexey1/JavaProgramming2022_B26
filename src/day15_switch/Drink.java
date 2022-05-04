package day15_switch;
import java.util.Scanner;
public class Drink {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter drink size");
        String size = input.nextLine();
        double price = 0;
        int calories = 0;
        boolean validOrder = true; // by making it true i pick that all orders are valid when I have an invalid order I will change it to false
        switch (size) {
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4.00;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("Wrong size name");
                validOrder = false; // wrong order, hence it's false
        }
        if (validOrder){ // wouldn't print wrong orders because of this boolean
            System.out.println("Size: " + size);
            System.out.println("Price: $" + price);
            System.out.println("Calories: " + calories);
        }
    }
}
