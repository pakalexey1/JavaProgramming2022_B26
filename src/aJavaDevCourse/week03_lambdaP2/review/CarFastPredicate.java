package aJavaDevCourse.week03_lambdaP2.review;

public class CarFastPredicate implements CarPredicate{
    @Override
    public boolean test(Car car){
        return car.getTopSpeed()>160;
    }
}
