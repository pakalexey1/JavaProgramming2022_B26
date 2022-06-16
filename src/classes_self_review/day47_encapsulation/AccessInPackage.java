package classes_self_review.day47_encapsulation;

public class AccessInPackage {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
//        System.out.println(obj.c);

        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
//        System.out.println(AccessModifier.z);

        //c and z are not accessible outside the class because they are private

        //b and y are default, sp they can be accessed in the same package

        // a nd x are public, so they are accessible outside a package


    }
}
