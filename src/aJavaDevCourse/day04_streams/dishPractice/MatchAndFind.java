package aJavaDevCourse.day04_streams.dishPractice;

import javax.swing.text.html.Option;
import java.util.Optional;

public class MatchAndFind {
    public static void main(String[] args) {

        System.out.println("All MATCH");
        boolean isHealthy = DishData.getAll().stream()
                .allMatch(dish->dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("\nANY MATCH");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("\nNONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish->dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("\nFIND ANY");
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get()); //this get() method belongs to the Optional<>

        System.out.println("\nFIND FIRST");
        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2.get());
    }
}
