package practice_array_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToTheEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 2, 0, 3, 49, 6, 5};
        System.out.println((moveAllZerosToTheEnd(arr)));
    }

    public static ArrayList<Integer> moveAllZerosToTheEnd(int[] arr) {

        ArrayList<Integer> output = new ArrayList<>();
        ArrayList<Integer> zeros = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                output.add(arr[i]);
            }
            if (arr[i]==0){
                zeros.add(0);
            }
        }
        ArrayList<Integer>finalOutput = output;
        for (int i = 0; i < zeros.size(); i++) {
            finalOutput.add(0);
        }
        return finalOutput;
    }
}
//    12  Move zeros
//    int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
//    ArrayList<Integer> list = new ArrayList<>();
//
//     output
//        [1, 2, 3, 49, 6, 5, 0, 0, 0]