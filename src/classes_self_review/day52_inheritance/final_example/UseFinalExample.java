package classes_self_review.day52_inheritance.final_example;

public class UseFinalExample {
    public static void main(String[] args) {
        System.out.println(FinalExample.PLANET);
        //FinalExample.PLANET = "Mars"; can't change final variable

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

//        obj.a=4; // can't reassign values of the final variable
//        obj.b=40; // can't reassign values of the final variable

        FinalExample obj2 = new FinalExample(100);
        System.out.println(obj2.a);
        System.out.println(obj2.b);
    }
}
