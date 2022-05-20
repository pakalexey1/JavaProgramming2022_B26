package day31_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = a;
        System.out.println(a==b);
        System.out.println(Arrays.equals(a,b));
        System.out.println(a==c); // compares the array with array, they are both reference to the same array object
        System.out.println(a.equals(b)); //this is not the same as Arrays.equals()

    }
}
