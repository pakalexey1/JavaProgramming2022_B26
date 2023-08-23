package aJavaDevCourse.week02_lambda.appleSortingAgain;

import aJavaDevCourse.week03_lambdaP2.Color;

public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
