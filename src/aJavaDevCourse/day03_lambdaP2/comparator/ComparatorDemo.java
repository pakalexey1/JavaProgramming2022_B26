package aJavaDevCourse.day03_lambdaP2.comparator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
