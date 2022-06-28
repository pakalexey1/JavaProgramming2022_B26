package classes_self_review.day52_inheritance.hiding;

public class CallAandB {
    public static void main(String[] args) {
        A obj = new A();
        obj.instanceMethodA();
        A.staticMethod();

        B obj1 = new B();
        obj1.instanceMethodA();
        B.staticMethod();
    }
}
