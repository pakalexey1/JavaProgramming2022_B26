package aJavaDevCourse.week04_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        System.out.println("reducing with initial value");
        int result = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);

        System.out.println("\nNo initial value");
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a+b);
        System.out.println(result2);

        System.out.println("\nMax and Min");
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min: " + min.get());
        System.out.println("Max: " + max.get());
        System.out.println("Sum: " + sum.get());
    }
}

