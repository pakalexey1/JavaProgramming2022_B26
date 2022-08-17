package classes_self_review.day55_polymorphism.interface_methods;

public class MacBookPro implements Mac{
    @Override
    public void turnOn() {

    }
}

class Runner{
    public static void main(String[] args) {

        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
//        System.out.println(MacBookPro.NAME); use interface reference when accessing variables, although you can access static variables from the child class
//        System.out.println(MacBookPro.OS);

//        Mac.turnOn(); not valid, need an object to call this method

        Mac.company();


        MacBookPro obj = new MacBookPro();
        obj.turnOn();
        obj.facetime();
//        obj.company(); static methods from an interface are not inherited, so they cannot be accessed from objects, only by interface.


    }
}
