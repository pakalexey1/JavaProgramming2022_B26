package aJavaDevCourse.day04_streams;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {

        Stream.iterate(0, n -> n + 2)
                .limit(5)
                .forEach(System.out::println);

        //How does it work? Iterate needs a lambda to specify the successor element
        //In case of the tuple (3,5), the successor (5, 3+5) = (5,8)
        //The next one is (8,5+8) = (8,13)
        //The final result should be written in tuples (0,1)(1,1)(1,2),(2,3),(3,5),(5,8)...

        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(8)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));

        System.out.println("\nPrint Fibonacci sequence one by one in a row");
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(8)
                .map(t->t[0])
                .forEach(System.out::println);
    }
}
