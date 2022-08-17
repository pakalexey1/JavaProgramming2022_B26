package practice_array_arraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SortElementsOfMultiDimArr {
    public static void main(String[] args) {
        int[][] arr = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
        sortMultiDimArr(arr);
    }

    public static void sortMultiDimArr(int[][] arr) {
        String output = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                Arrays.sort(arr[i]);
                System.out.print(arr[i][j]);
            }
        }
//        System.out.println(output);
    }
}



/*

     {  {9, 8, 7}, {6},  {5,4,3,2,1,0}   };    output should be
0 1 2 3 4 5 6 7 8 9

 */