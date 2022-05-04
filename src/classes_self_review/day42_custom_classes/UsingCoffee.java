package classes_self_review.day42_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {
        Coffee coffeeOne = new Coffee();
        coffeeOne.brand = "Starbucks";
        coffeeOne.type = "Black";
        coffeeOne.price = 3.99;
        coffeeOne.size=1.4;
        System.out.println(coffeeOne);
        coffeeOne.refill(1.5);
        System.out.println(coffeeOne);
    }
}
