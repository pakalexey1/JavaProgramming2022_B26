package classes_self_review.day52_inheritance.hiding;

public class B extends A {
    @Override
    public void instanceMethodA(){
        staticMethod();
    }

//    @Override --> we can't override the static methods, but we can declare this method and teh staticMethod from the parent class will become hidden.
    public static void staticMethod(){
        System.out.println("Static method from the CHILD class");
    }
}
