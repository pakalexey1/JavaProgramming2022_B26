package day46_static;

public class UseBestBuyClass {
    public static void main(String[] args) {

        //access the static members by the class name
        System.out.println(BestBuy.headquarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numberOfComputer);


        BestBuy store1 = new BestBuy("Oak Drive");
        System.out.println(store1.location);
        System.out.println(store1.numberOfComputer); // prints 100, as it's a static variable
        store1.numberOfComputer--;
        System.out.println(BestBuy.numberOfComputer); // prints 99 after it was reduced by 1, despite being called via a class

        BestBuy store2 = new BestBuy("Main St");

        store2.numberOfComputer -=5;
        System.out.println(store1.numberOfComputer); // prints 94, despite the value was reduced in store2

        System.out.println(store1.numberOfComputer);
        System.out.println(BestBuy.numberOfComputer);

        BestBuy.reStock();
        System.out.println(BestBuy.numberOfComputer);

        store1.reStock();
        System.out.println(BestBuy.numberOfComputer);

        // BestBuy.openStore() <-- can't use because it's not a static method, so it requires creation of an object first. Hence it can be used with store1 or store2

        store1.openStore();
        store2.openStore();

    }
}
