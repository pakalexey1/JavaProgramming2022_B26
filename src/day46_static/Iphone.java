package day46_static;

public class Iphone {

    String model;
    double price;

    static String company;
    static String os;
    static boolean appleDay;
    static String day;

    static{
        System.out.println("STATIC BLOCK RUN");
        company = "Apple";
        os = "iOS";
        day = "Wednesday";
        if (day.equalsIgnoreCase("Friday")) {

            appleDay=true;
        }

    }

    public Iphone(String model, double price) {
        System.out.println("CONSTRUCTOR RUN");
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
