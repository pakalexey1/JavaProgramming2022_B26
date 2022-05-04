package day32_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        int [] arr = {30, 90, 60, 360, 180};
        int [] arr2 = {180, 360, 30, 90, 60};
        int [] arr3 = arr;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.equals(arr, arr2)); // false

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr, arr2)); // true
        System.out.println(Arrays.equals(arr2, arr3)); //true

        String [] words = {"Hello", "Java", "Saturday"};
        System.out.println(String.join(" ### ", words));

        String str = "Today is Saturday";
        System.out.println(str.split(" "));
        System.out.println(Arrays.toString(str.toCharArray())); // returns char []
        System.out.println(Arrays.toString(str.split(" "))); // returns String []



    }

}
