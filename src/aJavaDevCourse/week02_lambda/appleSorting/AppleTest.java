package aJavaDevCourse.week02_lambda.appleSorting;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(200,Color.RED));
        inventory.add(new Apple(100,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

//        AppleHeavyPredicate heavy = new AppleHeavyPredicate();
//        List<Apple> heavyApple = filterApples(inventory, heavy);

        List<Apple> heavyApple = filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(heavyApple);

        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);

        System.out.println("------------PREDICATE-------------");
        List<Apple> greenApplePredicate = lambdaFilter(inventory, apple -> apple.getColor().equals(Color.GREEN));
        System.out.println(greenApplePredicate);
    }

    //using predicate
    private static List<Apple> lambdaFilter(List<Apple> inventory, Predicate<Apple> predicate){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory){
        if (predicate.test(apple)){
            result.add(apple);
        }
        }
        return result;
    }
    //using traditional format
    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory){
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
