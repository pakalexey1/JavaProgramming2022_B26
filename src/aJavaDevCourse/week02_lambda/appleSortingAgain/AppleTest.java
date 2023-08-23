package aJavaDevCourse.week02_lambda.appleSortingAgain;

import aJavaDevCourse.week03_lambdaP2.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.GREEN));
        inventory.add(new Apple(201, Color.RED));
        inventory.add(new Apple(50, Color.RED));

        System.out.println("-=-=-=-=-HEAVY APPLES FUNCTIONAL INTERFACE-=-=-=-=-");
        List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(heavyApple);
        System.out.println("------------HEAVY APPLES Lambda Way-----------");
        System.out.println(filterApplesLambda(inventory,applePredy -> applePredy.getWeight()>200));

        System.out.println("-=-=-=-=-GREEN APPLES FUNCTIONAL INTERFACE-=-=-=-=-");
        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);
        System.out.println("------------GREEN APPLES Lambda Way-----------");
        System.out.println(filterApplesLambda(inventory, applePred -> applePred.getColor().equals(Color.GREEN)));
    }
    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }
    private static List<Apple> filterApplesLambda(List<Apple> inventory, Predicate<Apple> applePredicate){

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }
}
