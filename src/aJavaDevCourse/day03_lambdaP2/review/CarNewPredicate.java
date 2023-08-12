package aJavaDevCourse.day03_lambdaP2.review;

public class CarNewPredicate implements CarPredicate{
    @Override
    public boolean test(Car car){
        return car.getYear()>2015;
    }
}
