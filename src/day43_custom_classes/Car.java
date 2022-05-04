package day43_custom_classes;

public class Car {
    String model;
    int year;
    String color;
    int fuelLevel;



    public void drive() {
        if (model != "Priora") {
            System.out.println("Driving " + model);
            fuelLevel -= 5;
        } else {
            System.out.println("Repair your " + model + " first.");
        }
    }

    public void fillTank(){
        System.out.println("Filling the tank");
        fuelLevel = 100;
    }

    public boolean isLow(){
        return fuelLevel<25;
    }

    public String toString() {
        return "Model: " + model +
                "\nYear: " + year +
                "\nColor: " + color +
                "\nFuel Level: " + fuelLevel + "% " +
                "\n" + (isLow() ? "Tank is low" : "Keep on driving");
    }

}


