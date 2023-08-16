package aJavaDevCourse.day03_lambdaP2.review;

import day16_review.CarpetShop;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {

        Car car = Car.builder().make("Toyota").topSpeed(145).year(2000).build();
        System.out.println(car);

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", 140, 1998));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Honda", 140, 2018));

        System.out.println("Fast Cars");
//        System.out.println(filterFastCars(carList));
        System.out.println(filterCars(carList, new CarFastPredicate()));

        System.out.println("New Cars");
//        System.out.println(filterNewCars(carList));
        System.out.println(filterCars(carList, new CarNewPredicate()));

        System.out.println("Lambda Fast Cars");
        CarPredicate carPredicate = (Car car1) -> car1.getTopSpeed()>160;
        System.out.println(filterCars(carList,carPredicate));

        System.out.println("Lambda New Cars");
        System.out.println(filterCars(carList, (Car car2) -> car2.getYear()>2015));

    }

    //Using two methods to create two very similar methods
//    private static List<Car> filterFastCars(List<Car> cars){
//        List<Car> filteredCars = new ArrayList<>();
//        for(Car car: cars){
//            if (car.getTopSpeed()>160){
//                filteredCars.add(car);
//            }
//        }
//        return filteredCars;
//    }
//
//    private static List<Car> filterNewCars(List<Car> cars){
//        List<Car> filteredCars = new ArrayList<>();
//        for(Car car: cars){
//            if (car.getYear()>2015){
//                filteredCars.add(car);
//            }
//        }
//        return filteredCars;
//    }


    //Using functional interface approach:
    private static List<Car> filterCars(List<Car> cars, CarPredicate carPredicate){
        List<Car> filteredCars = new ArrayList<>();
        for(Car car: cars){
            if (carPredicate.test(car)){
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    //Using Lambda


}
