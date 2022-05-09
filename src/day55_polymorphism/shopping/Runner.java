package day55_polymorphism.shopping;

public class Runner {
    public static void main(String[] args) {

        Target target = new Target();
        target.price = 10;
        target.buyItem();;
        target.returnItem();
        // target.payForShipping(true); Target class does not implement the Shipping interface

        System.out.println();

        Amazon amazon = new Amazon();
        amazon.price = 1000;
        amazon.buyItem();
        amazon.returnItem();
        amazon.payForShipping(true);
        amazon.viewCart();
        System.out.println(amazon.country);

    }
}

/*
Shopping and OnlineShopping are abstract classes, so we can't make object of them

Shipping is an interface, so we can't make an object of it
 */
