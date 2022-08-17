package classes_self_review.day56_polymorphism.car;

public class Car {
}

class BMW extends Car{}

class Tesla extends Car{}

class Toyota extends Car{}

class Ford extends Car{}

class LandRover extends Car{}

class Dealership {

    public static void lease(Car car) {
        System.out.println("Leasing a car " + car.getClass().getName());
    }
}

    class Runner {
        public static void main(String[] args) {
            Car car = new Car();
            Dealership.lease(car);

            Tesla tesla = new Tesla();
            Dealership.lease(tesla);

            Dealership.lease(new LandRover());
            Dealership.lease(new Toyota());
        }
    }

