package day42_custom_classes;

public class UsingCoffeeClass {
    public static void main(String[] args) {

        Coffee coffee1 = new Coffee();
        coffee1.brand = "Starbucks";
        coffee1.type = "arabica";
        coffee1.size = 3.2;
        coffee1.price = 4.50;

        coffee1.drink();
        coffee1.refill(2.5);

        System.out.println(coffee1);



    }
}
