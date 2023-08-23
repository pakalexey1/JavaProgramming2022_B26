package aJavaDevCourse.week04_streams.dishPractice;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        System.out.println("\nPrint all dish's name that has less than 400 calories");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(dish -> dish.getName()) // same as: Dish::getName;
                .forEach(System.out::println);

        System.out.println("\nPrint the length of the name of each dish");
        DishData.getAll().stream()
                .map(Dish::getName)//same as dish->dish.getName()
                .map(String->String.length())//same as String::length
                .forEach(System.out::println);

        System.out.println("\nPrint Three high calories dish name (>300)");
        DishData.getAll().stream()
                .filter(dish->dish.getCalories()>300)
                .map(dish->dish.getName())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\nPrint all dish name that are below 400 calories in sorted format");
        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed())//change the sort order to reverse using reversed() method
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}
