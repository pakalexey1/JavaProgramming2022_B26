package classes_self_review.day52_inheritance.hiding;

public class Person {
    String name = "James Bond";


}

class SecretIdentity extends Person{

    String name = "DNOM SEMAJ"; // we created another name variable in the sub class, but it was already being inherited, so the parent variable is being hidden.

}

class Runner{
    public static void main(String[] args) {
        Person obj = new Person();
        System.out.println(obj.name);

        SecretIdentity secretIdentityObj = new SecretIdentity();
        System.out.println(secretIdentityObj.name);
    }
}
