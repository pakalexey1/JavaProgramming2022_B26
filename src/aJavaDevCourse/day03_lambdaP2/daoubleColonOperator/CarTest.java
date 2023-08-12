package aJavaDevCourse.day03_lambdaP2.daoubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {


        //Zero-argument
        Supplier<Car> c1 = () -> new Car(); //executing an empty constructor using Supplier interface because it accepts nothing
        System.out.println(c1.get().getName());

        Supplier<Car>c2 = Car::new;
        System.out.println(c2.get().getModel());

        //One-Argument

        Function<Integer,Car> f1 = model -> new Car(model);
        Car bmw = f1.apply(2009);
        System.out.println(bmw.getModel());

        Function<Integer, Car> f2 = Car::new;
        Car bmw2 = f2.apply(2015);
        System.out.println(bmw2.getModel());

        //Two-Argument
        BiFunction<String,Integer,Car> b1 = (name,model) -> new Car (name,model);
        Car honda = b1.apply("Honda",2007);
        System.out.println(honda.getName() + " " + honda.getModel());

        BiFunction<String,Integer,Car> b2= Car::new;
        Car nissan = b2.apply("Nissan",2001);
        System.out.println(nissan.getName() + " " + nissan.getModel());

    }
}