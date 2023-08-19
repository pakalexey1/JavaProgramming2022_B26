package aJavaDevCourse.day02_lambda.appleSortingAgain;

import aJavaDevCourse.day03_lambdaP2.Color;

public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
