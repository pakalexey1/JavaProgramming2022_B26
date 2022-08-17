package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortArrayWithoutUsingSort {

    public static void main(String[] args) {
        Integer arr[] = {4,3,2,12,54,34,88};
        System.out.println(Arrays.toString(sortArr(arr)));

    }

    public static int[] sortArr(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Set<Integer> tree = new TreeSet<>(list);
        ArrayList<Integer> temp = new ArrayList<>(tree);
        int[] output = new int[temp.size()];
        for (int i = 0; i < output.length; i++) {
            output[i] = temp.get(i);
        }

        return output;
    }
}