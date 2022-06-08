package classes_self_review.day46_static;

public class IPhone {

    String model;
    double price;

    static String company;
    static String os;
    static boolean appleDay;
    static String day;

    static {
        System.out.println("STATIC BLOCK RUN");
        company = "Apple";
        os = "iOS";
        day = "Wednesday";
        if (day.equals("Friday")){
            appleDay=true;
        }
    }

    public IPhone(String model, double price) {
        System.out.println("CONSTRUCTOR RUN");
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
