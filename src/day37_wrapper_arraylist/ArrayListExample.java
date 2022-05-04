package day37_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList <Integer> numbs = new ArrayList<>();
        System.out.println(numbs);

        // add/assign to an array [index] = value

        numbs.add(100);
        System.out.println(numbs);

        numbs.add(-100);
        System.out.println(numbs);

        numbs.add(50);
        numbs.add(23);
        System.out.println(numbs);
        System.out.println(numbs.get(0));
        System.out.println(numbs.get(1));
        System.out.println(numbs.get(2));
        System.out.println(numbs.get(3));

        // how do you know how many elements are in the array?
        // is length a method --> no?

        System.out.println("number of elemetns in this ArrayList: " + numbs.size());

    }
}
