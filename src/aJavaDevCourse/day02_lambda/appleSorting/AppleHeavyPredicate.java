package aJavaDevCourse.day02_lambda.appleSorting;

public class AppleHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple){
        return apple.getWeight()>200;
    }
}
