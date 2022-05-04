package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Fourth extends First {
    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one);
        //System.out.println(obj.two);
        //System.out.println(obj.three);
        //System.out.println(obj.four);

        Fourth obj2 = new Fourth();
        System.out.println(obj2.one); // public
        System.out.println(obj2.two); // protected

        // line 10 is trying to directly access a protected variable outside of the package. You cannot directly access any protected information outsodie of the pacakge

        // line 16 we are able to access the two variables because it is inherited from the first class to the four class, so the two variables belong to the objects of the Four class (sub class)

    }
}
