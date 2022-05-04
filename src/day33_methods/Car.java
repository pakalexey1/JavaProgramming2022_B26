package day33_methods;

public class Car {
    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }

    public static void openDOor(){
        System.out.println("Opening the door");
    }

    public static void sitInCar(){
        System.out.println("Sitting in the car");
        System.out.println("Close the door");
    }

    public static void getReadyToGO () {
        System.out.println("Putting on seatbelt");
        System.out.println("Check mirrors");
        System.out.println("Put on music");
        System.out.println("Put on navigation");
    }

    public static void startCar(){
        System.out.println("Starting the car");
    }

    public static void driveAndGo(){
        System.out.println("Putting car into drive");
        System.out.println("Going forward");
    }

    public static void goInHurry(){
        unlockCar();
        sitInCar();
        startCar();
        driveAndGo();
    }

    public static void main(String[] args) {
        unlockCar();
        unlockCar();
        openDOor();
        sitInCar();
        getReadyToGO();
        startCar();
        driveAndGo();

        System.out.println("===============");
        goInHurry();
    }
}


/*

unlock the car
open the door
sit in the car
close the door
put on seatbelt
start the engine
put into drive and go

 */