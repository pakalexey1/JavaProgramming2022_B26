package tasks_from_festina.group15tasks_2022may16;

import java.util.Arrays;

public class SortArrayAsc {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        int[] arrAsc = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            for (int j = i; j < arr.length;) {
                if (arr[j] > max) {
                    arrAsc[arrAsc.length-i-1] = arr[j];
                    j++;
                }else{
                    arrAsc[arrAsc.length-i-1]=arr[i];
                    j++;
                }
            }
        }
//        System.out.println(min);
        System.out.println(Arrays.toString(arrAsc));
    }
}
