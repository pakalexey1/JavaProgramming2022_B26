package classes_self_review.day55_polymorphism.shopping;

public final class Target extends Shopping{

    @Override
    public void buyItem() {
        System.out.println("Buying an item from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning an item to Target");
    }
}


/*

Create a concrete class Target
 - Make the class final
 - Inherit Shopping and implement all abstract methods
 */