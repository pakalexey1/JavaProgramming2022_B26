package classes_self_review.day42_custom_classes;

public class Coffee {
    String brand;
    String type;
    double price;
    double size;


    public String toString(){
        String result =
                "Your " + brand + " " + type + " coffee is going to cost you $" + price*size + " for " + size + " oz.";
        return result;
    }

    public void refill(double refill){
        System.out.println("Refilling " + refill +" oz.");
        size+=refill;
    }

    public void drink (){
        System.out.println("Drinking "+ type + " coffee");
        size -=1.5;
    }
}
