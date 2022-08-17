package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertAscArrToDesc {
    public static void main(String[] args) {
        int[] arr11 = {101,200, 155, 100, 4, 3, 1, -1, -100};
        System.out.println(Arrays.toString(convertAscArrToDesc(arr11)));
        System.out.println(Arrays.toString(sortArr(arr11)));
    }

    public static int[] convertAscArrToDesc(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] sortArr(int[] arr) {
        Arrays.sort(arr);
        int [] output = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            output[arr.length-1-i] = arr[i];
        }
        return output;
    }
}

/*
    //55
    int[] arr11 = {200, 155, 100, 4, 3, 1, -1, -100};
    convert it ascending array and print like this
        [-100, -1, 1, 3, 4, 100, 155, 200]
        */
