package day42_custom_classes;

import java.util.Scanner;

public class Coffee {

    String brand;
    double price;
    String type;
    double size;


    @Override
    public String toString() {
        return
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", size=" + size;
    }

    public void drink() {
        System.out.println("Drinking " + type);
    }

    public void refill( double amount) {

        System.out.println("Refilling " + amount + " oz of coffee to the total size of " + (size + amount));
        size+=amount;
    }

    public void gainingWEight(){

    }


}

/*

Create a coffee class with these instance variables:
    price, size(oz), brand, types

Instance methods:
    make a toString to print all the ifnroamtion of the coffee objects

    drink:print trying type of coffee

    refill(amount in oz): print refilling x oz
        add the number of oz to the total size

 */