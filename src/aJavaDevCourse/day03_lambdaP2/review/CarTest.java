package aJavaDevCourse.day03_lambdaP2.review;

public class CarTest {
    public static void main(String[] args) {

        Car car = Car.builder().make("Toyota").topSpeed(145).year(2000).build();
        System.out.println(car);
    }
}
