package aJavaDevCourse.week02_lambda.appleSortingHomeWork;

public class AppleIsGreen implements ApplePredicate {
    @Override
    public boolean test (Apple apple){
        return apple.getColor().equals(Color.GREEN);
    }
}
