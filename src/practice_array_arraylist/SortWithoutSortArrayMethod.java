package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SortWithoutSortArrayMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 23, 4, 3, 123, 4, 23, 12, 43, 3));
        System.out.println(ascendingWithoutSortArrayMethod(arr));
        System.out.println(descendingWithoutSortArrayMethod(arr));
    }

    public static ArrayList<Integer> ascendingWithoutSortArrayMethod(ArrayList<Integer> list) {

        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static ArrayList<Integer> descendingWithoutSortArrayMethod(ArrayList<Integer> list) {

        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }

            }

        }
        return list;
    }
}
/*
5.
Don't use sort method
ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));
first
output
[1, 2, 2, 3, 4, 4, 5, 10, 10, 50, 50]

second
[50, 50, 10, 10, 5, 4, 4, 3, 2, 2, 1]

---------------SECOND------------
Store into Array
2int[] arr = {1, 2, 3, 49, 6, 5};
ArrayList<Integer> list = new ArrayList();

 */