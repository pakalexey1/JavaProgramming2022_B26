package aJavaDevCourse.week04_streams.flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmpData {
    public static Stream<Employee> readAll() {
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("2099124536", "2023464768")),
                new Employee(100, "Alex", "alex@cydeo.com", Arrays.asList("7039124536", "7033464768")),
                new Employee(100, "Dan", "dan@cydeo.com", Arrays.asList("5169124536", "5163464768"))
        );
    }
}
