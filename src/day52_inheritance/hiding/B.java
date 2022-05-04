package day52_inheritance.hiding;

public class B extends A{

    @Override
    public void instanceMethodA(){
        staticMethod();

    }
   // @Override --> we cannot override the static methods, but we can declare this method and the statiMethod from the parent class will become hidden
    public static void staticMethodC(){
        System.out.println("Static method from the CHILD class");
    }
}
