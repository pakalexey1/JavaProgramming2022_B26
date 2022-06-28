package classes_self_review.day51_inheritance.access.a;

public class Second {
    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
        //System.out.println(obj.four); different class, same package - private variable is not accessible
    }
}
