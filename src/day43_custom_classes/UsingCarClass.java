package day43_custom_classes;

public class UsingCarClass {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model="Prioras";
        car1.fuelLevel = 25;
        car1.year = 1994;
        car1.color = "Green";
        System.out.println(car1);
        car1.drive();
        System.out.println(car1.fuelLevel);
        car1.drive();
        System.out.println(car1);
        car1.fillTank();
        System.out.println(car1.fuelLevel);

    }
}
