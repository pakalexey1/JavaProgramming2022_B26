package classes_self_review.day51_inheritance.lyft;

public class CarRide {

    public static void main(String[] args) {

        Lyft obj1 = new Lyft("James");
        System.out.println(obj1.calculateRate(10));

        Lyft obj2 = new LyftXL("Mark");
        System.out.println(obj2.calculateRate(10));
    }
}
