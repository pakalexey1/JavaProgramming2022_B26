package classes_self_review.day55_polymorphism.interface_methods;

public interface Mac {
    String NAME = "Mac"; //public static final variables
    String OS = "MAC OS";

    void turnOn();//public abstract

    //Q: How do you create a method with implemenation in an interface?
//        - One way is a static method:

    static void company(){
        System.out.println("Apple");
        System.out.println("HQ is in Cupertino");
        System.out.println("New release is in Nov");
    }
//        - another way is a default method

    public default void facetime(){ // default is not an access modifier, it's a keyword, meaning a method that can be implemented in an interface

        System.out.println("Opening facetime");
        System.out.println("Calling someone");
    }
}

