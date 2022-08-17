package practice_array_arraylist;

import java.util.Arrays;

public class MergeArraysAndSort {
    public static void main(String[] args) {
        int a[] = {1, 3, 5};
        int b[] = {2, 4, 6};

        System.out.println(Arrays.toString(mergeArraysAndSort(a, b)));
    }

    public static int[] mergeArraysAndSort(int[] a, int[] b) {
        int[] arr = Arrays.copyOf(a, a.length + b.length);
        int count = 0;
        for (int i = a.length; i < arr.length; i++) {
            arr[i] = b[count++];
        }
        Arrays.sort(arr);

        return arr;
    }

}


/*
//70 Store into Array
int a[]={1,3,5};
            int b[]={2,4,6};
            output
            [1,2,3,4,5,6]
 */