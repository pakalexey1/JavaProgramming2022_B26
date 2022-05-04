package day18_string;

import java.util.Scanner;

public class HouseAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your address");
        String address = input.nextLine().trim();
        String addressNoZip = address.substring(0,address.indexOf(","));
        String streetType = addressNoZip.substring(addressNoZip.lastIndexOf(" ")+1);
        System.out.println(address.toUpperCase());
        System.out.println(addressNoZip.startsWith("5") ? "house on the right side" : addressNoZip.startsWith("6") ? "house on the left side" : "house in the middle");
        System.out.println("house on "+streetType);

    }
}
