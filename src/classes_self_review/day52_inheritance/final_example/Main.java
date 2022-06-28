package classes_self_review.day52_inheritance.final_example;

public class Main {
    public static void main(String[] args) {

        new Parent().walk();
        new Child().walk();

    }
}

class Parent{

    public final void walk(){
        System.out.println("You are walking");
    }

}

class Child extends Parent{

//    @Override   -> can't override final methods
//    public final void walk(){
//
//    }

}
