package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int r[]={-1,3,5,6,7,9,13,18,70,80};
        System.out.println(missingNumbers(r));
    }

    public static ArrayList<Integer> missingNumbers (int[]arr){
        Arrays.sort(arr);
        ArrayList<Integer> output = new ArrayList<>();
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }

        for (int i = arr[0]; i < arr[arr.length-1] ; i++) {
            if (!arrList.contains(i)){
                output.add(i);
            }
        }

        return output;
    }
}

    //40  FIND missing number
    //int r[]={-1,3,5,6,7,9,13,18,70,80};
