package classes_self_review.day55_polymorphism.shopping;

public class Amazon extends OnlineShopping{

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");
    }

    @Override
    public void payForShipping(boolean b) {
        System.out.println(b? "Pay for shipping": "Free Shipping");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying an item on Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning an item to Amazon");
    }
}


/*
Create a concrete class Amazon
    - Make the class final
    - Inherit OnlineShopping and implement all abstract methods
 */