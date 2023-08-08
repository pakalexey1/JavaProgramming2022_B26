package aJavaDevCourse.day01_oop;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("apple");

        printDouble(items);
//        for (Object item : items) {
//            System.out.println((Integer) item * 2);
//        }
    }

    private static void printDouble(ArrayList<Integer> items) {
        for (int i : items) {
            System.out.println(i*2);
        }
    }
}