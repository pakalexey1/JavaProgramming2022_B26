package classes_self_review.day46_static.bestbuy;

public class BestBuy {

    String location;
    static String headquarters = "Richfield, Minnesota, USA";
    static String day = "Wednesday";
    static int numberOfComputers = 100;

    public BestBuy(String location){
        this.location=location;
    }
    public static void reStock(){
        numberOfComputers+=20;
    }
}
