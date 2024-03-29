package practice_array_arraylist;

import java.util.Arrays;

public class SortAscendingWithoutSortMethod {
    public static void main(String[] args) {
        int[] arr11 = {200, 155, 100, 4, 3, 1, -1, -100};
        System.out.println(Arrays.toString(sortAscendingWithoutSortMethod(arr11)));
    }

    public static int[] sortAscendingWithoutSortMethod(int[]arr){

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return (arr);
    }
}


/*
//55
int[] arr11 = {200, 155, 100, 4, 3, 1, -1, -100};
convert it ascending array and print like this
[-100, -1, 1, 3, 4, 100, 155, 200]
 */