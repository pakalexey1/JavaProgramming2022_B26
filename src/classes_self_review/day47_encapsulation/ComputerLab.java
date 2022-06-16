package classes_self_review.day47_encapsulation;

public class ComputerLab {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Computer comp1 = new Computer("HP", 1000, "Silver");

        Computer.hasBattery = false;
        System.out.println(Computer.hasBattery);
        //System.out.println(Computer.brand); -> not possilbe because brand is the instance variable and we are
        // trying to access by the class name instead of the object name.
        System.out.println(comp1.brand);

    }
}
