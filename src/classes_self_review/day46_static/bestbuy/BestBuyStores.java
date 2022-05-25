package classes_self_review.day46_static.bestbuy;

public class BestBuyStores {
    public static void main(String[] args) {
        System.out.println(BestBuy.headquarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numberOfComputers);

        BestBuy store1 = new BestBuy("Oak Drive");
        System.out.println(store1.location);
        System.out.println(store1.numberOfComputers);

        store1.numberOfComputers--;
        System.out.println(BestBuy.numberOfComputers);

        BestBuy store2 = new BestBuy("Main st");
        store2.numberOfComputers -=5;
        System.out.println(BestBuy.numberOfComputers);
        store2.location = "Fairfax";
        System.out.println(store1.location);
        System.out.println(store2.location);

        BestBuy.reStock();
        System.out.println(BestBuy.numberOfComputers);
        store1.reStock();
        System.out.println(BestBuy.numberOfComputers);
    }
}
