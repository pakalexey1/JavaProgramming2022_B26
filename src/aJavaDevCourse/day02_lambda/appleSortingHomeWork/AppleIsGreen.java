package aJavaDevCourse.day02_lambda.appleSortingHomeWork;

import day42_custom_classes.App;

public class AppleIsGreen implements ApplePredicate {
    @Override
    public boolean test (Apple apple){
        return apple.getColor().equals(Color.GREEN);
    }
}
