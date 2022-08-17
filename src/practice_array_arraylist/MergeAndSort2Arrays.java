package practice_array_arraylist;

import java.util.Arrays;

public class MergeAndSort2Arrays {
    public static void main(String[] args) {
        int[] b = {1, 3, 5};
        int[] a = {2, 4, 6, 8};

        System.out.println(Arrays.toString(mergeAndSort2Arrays(a, b)));
    }

    public static int[] mergeAndSort2Arrays(int[] a, int[] b) {

        int[] output = Arrays.copyOf(a,a.length+b.length);

        for (int i = a.length; i < output.length; i++) {
            output[i] = b[i - a.length];
        }

        Arrays.sort(output);
        return output;
    }
}


/*
//36
 int a[]={1,3,5};
 int b[]={2,4,6};

output Array
[1, 2, 3, 4, 5, 6]
 */