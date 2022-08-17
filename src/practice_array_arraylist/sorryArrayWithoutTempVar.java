package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class sorryArrayWithoutTempVar {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));
        System.out.println(sortAscending(list));
        System.out.println(sortDescending(list));

    }
    public static ArrayList<Integer> sortAscending(ArrayList<Integer> arr) {

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(i)) {
                    arr.set(i, arr.get(i) + arr.get(j));
                    arr.set(j, arr.get(i) - arr.get(j));
                    arr.set(i, arr.get(i) - arr.get(j));
                }
            }
        }
        return arr;
    }

    public static ArrayList<Integer> sortDescending (ArrayList<Integer> arr){

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) > arr.get(i)) {
                    arr.set(i, arr.get(i) + arr.get(j));
                    arr.set(j, arr.get(i) - arr.get(j));
                    arr.set(i, arr.get(i) - arr.get(j));
                }
            }
        }
        return arr;
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
 */