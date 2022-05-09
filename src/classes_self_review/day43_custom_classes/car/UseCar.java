package classes_self_review.day43_custom_classes.car;

public class UseCar {
    public static void main(String[] args) {
        Car carOne = new Car();
        carOne.model = "2106";
        carOne.year = 1991;
        carOne.color = "Beige";
        carOne.fuel = 30;

        System.out.println(carOne);
        carOne.drive();
        carOne.drive();
        carOne.drive();
        carOne.drive();
        carOne.drive();

        System.out.println(carOne);
        carOne.fillTank();
        System.out.println(carOne);



    }
}
