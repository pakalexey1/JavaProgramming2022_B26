package classes_self_review.day51_inheritance.access.b;

import classes_self_review.day51_inheritance.access.a.First;

public class Third {
    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one);
//        System.out.println(obj.two); protected has no inheritance, so no visibility, as without inheritance it works the same way as default - only visible in the same package
//        System.out.println(obj.three); default is only visible in the same package
//        System.out.println(obj.four); private is only visible in the same class
    }
}
