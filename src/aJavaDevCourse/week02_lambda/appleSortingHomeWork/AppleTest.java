package aJavaDevCourse.week02_lambda.appleSortingHomeWork;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
//        System.out.println(AppleData.allApples());

        List<Apple> listOfApples = new ArrayList<>();
        listOfApples.add(new Apple(100, Color.RED));
        listOfApples.add(new Apple(150, Color.GREEN));
        listOfApples.add(new Apple(400, Color.RED));
        listOfApples.add(new Apple(500, Color.GREEN));

        List<Apple> heavyApple = testApples(listOfApples,new AppleIsHeavy());
        System.out.println(heavyApple);

        System.out.println(testApples(listOfApples, new AppleIsGreen()));


    }

    public static List<Apple> testApples(List<Apple> listOfApples,ApplePredicate ap){
        List<Apple> result= new ArrayList<>();
        for (Apple apple : listOfApples){
            if(ap.test(apple)){
                result.add(apple);
            };
        }

        return result;
    }
}
