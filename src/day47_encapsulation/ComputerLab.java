package day47_encapsulation;

public class ComputerLab {
    public static void main(String[] args) {

        System.out.println("Hello World");
        Computer comp = new Computer ("HP", 500.00, "Silver");

        Computer.hasBattery = false;
        System.out.println(Computer.hasBattery);

        //System.out.println(Computer.brand); an instance variable, requires an object to use it
        System.out.println(comp.brand);

        System.out.println(comp.hasMemory); // you can access static members from an object reference because object comes from the class, but it's better to access static members by the class name

    }
}
