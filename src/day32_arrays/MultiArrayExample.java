package day32_arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        int[] n = {5, 10, 20, 10};
        int[] m = {5, 10, 100, 39, 19};

        int [][] all = {n, m};
        System.out.println(all); // print the location
        System.out.println(Arrays.toString(all)); // also prints the locations instead of the arrays
        System.out.println(Arrays.deepToString(all)); // this method prints the actual multidimensional arrays
        System.out.println(Arrays.toString(all[0])); // printing the first element of MD array
        System.out.println(Arrays.toString(all[1])); // printing the second element of MD array

        System.out.println();

        int[][] multi = {
                {90,80,70}, // index 0 of the MD array
                {19,51,1129,12}, // index 1 of the MD array
                {10,1900}, // index 2 of the MD array
                {14} // index 3 of the MD array
        };

        System.out.println(multi.length); //the number of elements in the MD array
        System.out.println(multi[0].length); // the number of elements in the first array of the MD array
        System.out.println(multi[0][1]); // prints element #2 of the 1st array of the MD array
        System.out.println(multi[3].length); // the length of the 4th array of the MD array
    }
}
