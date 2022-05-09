package day55_polymorphism.interface_methods;

public interface Mac {

    String NAME = "Mac"; // public static final variables, that's why variable names are capitalized
    String OS = "IOS";

    void turnOn(); // public abstract - a method without implementation

    //Q: How do you create a method with implementation in an interface?
    // One way is a static method:

    public static void company() {
        System.out.println("Apple");
        System.out.println("HQ in Bay Area");
        System.out.println("New release in November");
    }

    // One way is a default method:

    public default void faceTime() {
        System.out.println("Opening Facetime");
        System.out.println("Calling someone on Facetime");
    }
}
