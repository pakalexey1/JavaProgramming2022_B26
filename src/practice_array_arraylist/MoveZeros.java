package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
        System.out.println(Arrays.toString(moveZeros(arr)));
    }

    public static int[] moveZeros(int[] a) {
        int[] out = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=0){
                out[count++] = a[i];
            }
        }
        return out;
    }
}

//    //12  Remove zeros
//    int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
//
//output
//        [1, 2, 3, 49, 6, 5, 0, 0, 0]