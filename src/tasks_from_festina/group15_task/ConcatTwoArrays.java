package tasks_from_festina.group15_task;

import java.util.ArrayList;

public class ConcatTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {43, 1, 23, 5};
        System.out.println(concatTwoArrays(a, b));
    }

    public static ArrayList<Integer> concatTwoArrays(int[] a, int[] b) {

        ArrayList<Integer> aList = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            aList.add(a[i]);
        }
        ArrayList<Integer> bList = new ArrayList<Integer>();
        for (int i = 0; i < b.length; i++) {
            bList.add(b[i]);
        }
        aList.addAll(bList);
        return aList;
    }
}
/*
16) Array - Concat two arrays
Write a return method that can concatenate two arrays
 */