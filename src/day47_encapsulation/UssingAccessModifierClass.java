package day47_encapsulation;

public class UssingAccessModifierClass {
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
        //  System.out.println(obj.c); not accessible, because it's private

        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
        // System.out.println(AccessModifier.z); not accessible because it's private
    }
}