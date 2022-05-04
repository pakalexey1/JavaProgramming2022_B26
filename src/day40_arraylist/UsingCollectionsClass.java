package day40_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 6, 2, 67, 22, 230, 12));

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('A','B','C','D'));
        Collections.reverse(letters);
        System.out.println(letters);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Collections.swap(letters, 0,3);
        System.out.println(letters);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,11,12,11,565,11,45,2));
        System.out.println(Collections.frequency(numbers,11));



    }
}
