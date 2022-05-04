package day53_abtraction.cars;

public class Garage {
    public static void main(String[] args) {

        //Car obj1 = new Car(); -> Car is abstract, so we cannot make an object of this class

        Toyota obj2 = new Toyota();
        obj2.start();

        Honda obj3 = new Honda();
        obj3.start();

        //Both Toyota and Honda are concrete classes (the first non-abstract child classes), because they wre not abstract, so we had to implement the start method

        // ElectricCar obj4 = new ElectricCar(); -> ElectricCar is abstract, so we can't make a class out of it.

        Tesla obj5 = new Tesla ();
        obj5.start(); // defined in the Car class
        obj5.charge(); // defined in the ElectricCar class
        // Tesla was a non-abstract class, so it was concrete, which means it had to override all the abstract methods from the super classes.


    }
}
