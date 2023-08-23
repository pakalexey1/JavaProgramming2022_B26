package aJavaDevCourse.week02_lambda.appleSortingHomeWork;

public class AppleIsHeavy implements ApplePredicate{
    @Override
    public boolean test (Apple apple){
        return apple.getWeight()>200;
    }
}
