package aJavaDevCourse.day04_streams;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,6,3,4,9,3,5,8,5,2);
        myList.forEach(x -> System.out.println(x));
        myList.forEach(System.out::println);

        //FILTER - intermediate operation
        System.out.println("--------FILTER EXAMPLE-------------");
        myList.stream()
                .filter(i -> i%3 == 0)
                .distinct() //shows only distinct elements
                .forEach(System.out::println);

        //LIMIT
        System.out.println("-----------LIMIT Example--------------");
        myList.stream()
                .filter(i -> i%2 == 0)
                .limit(9) //limits the output to "n" number of elements
                .forEach(System.out::println);

        //SKIP
        System.out.println("-----------SKIP Example--------------");
        myList.stream()
                .filter(i ->i%2 == 0)
                .skip(2) //skips first "n" elements
                .forEach(System.out::println);

        //MAP
        System.out.println("-----------MAP Example--------------");
        myList.stream()
                .map(number -> number*2) //doubled every number in the array
                .filter(i->i%3==0) //filtered only those that are divisible by 3
                .forEach(System.out::println);
    }
}
