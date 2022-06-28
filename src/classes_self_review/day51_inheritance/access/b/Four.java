package classes_self_review.day51_inheritance.access.b;

import classes_self_review.day51_inheritance.access.a.First;

public class Four extends First {
    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one);
//       System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);


        Four obj2 = new Four();
        System.out.println(obj.one); //public
        System.out.println(obj2.two); // protected
    }
}
