package classes_self_review.day53_abstraction.cars;

public class Garage {
    public static void main(String[] args) {

        Toyota obj2 = new Toyota();
        obj2.start();

        Honda obj3 = new Honda();
        obj3.start();

        Tesla obj4 = new Tesla();
        obj4.start();
        obj4.charge();
    }
}
