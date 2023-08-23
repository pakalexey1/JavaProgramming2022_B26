package aJavaDevCourse.week04_streams.collectors;

import aJavaDevCourse.week04_streams.dishPractice.Dish;
import aJavaDevCourse.week04_streams.dishPractice.DishData;
import aJavaDevCourse.week04_streams.dishPractice.Type;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 70);

        //toCollection(Supplier) : is used to create a collection using collector and it accepts Supplier functional interface
        System.out.println();
        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new)); //using toCollection() method create an ArrayList that will put all the filtered elements from filter() method
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        //toList(): returns a Collector interface that gathers the input data into a new list
        System.out.println("----------TOLIST()---------------");
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        //toSet(): returns a Collector interface that fathers the input data into a new set
        System.out.println("----------TOSET()---------------");
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        //toMap(Function,Function): returns a Collector interface that gathers the input data into a new map
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        //counting(): returns a Collector that counts the number of the elements
        Long evenCount = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        //summingInt(ToIntFunction): returns a Collector that produces the sum of an integer-valued function (rarely used)
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //averageingInt(ToIntFunction): returns a Collector that produces the average of an integer-valued function (rare)
        Double caloriesAvg = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(caloriesAvg);

        //joining(): is used to join various elements of a character or string array into a single string object
        List<String> courses = Arrays.asList("Java","JS","TS");
        courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(courses);

        //partitioningBy(): is used to partition a stream of objects (or set of elements based on a given predicate
        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        //groupingBy(): is used for grouping objects by some property and storing results in a map instance
        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);

    }
}
