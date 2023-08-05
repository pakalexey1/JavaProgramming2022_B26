package practice_array_arraylist;

import java.util.Arrays;

public class FirstDuplicatedElementFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 8, 9, 2, 2};
        System.out.println(findFirstDuplicate(arr));
    }

    public static int findFirstDuplicate(int[] arr) {

        int dup = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
