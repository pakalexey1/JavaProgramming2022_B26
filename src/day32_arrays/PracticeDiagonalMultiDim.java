package day32_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PracticeDiagonalMultiDim {
    public static void main(String[] args) {
        int[][] array = {
                {3, 5, 1, 6},
                {1, 6, 10, 12},
                {5, 21, 10, 16},
                {12, 54, 0, 100}
        };

        int[] diagonalAr1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    diagonalAr1[i] = array[i][j];
                }
            }
        }
        int sumOfDiag1 = 0;
        for (int i = 0; i < diagonalAr1.length; i++) {

            sumOfDiag1 += diagonalAr1[i];
        }

        int[] diagonalAr2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i + j == array.length - 1) {
                    diagonalAr2[i] = array[i][j];
                }
            }
        }
        int sumOfDiag2 = 0;
        for (int i = 0; i < diagonalAr2.length; i++) {
            sumOfDiag2 += diagonalAr2[i];
        }
        if (sumOfDiag1 > sumOfDiag2) {
            System.out.println(Arrays.toString(diagonalAr1) + " is the largest diagonal, it's sum is " + sumOfDiag1);
        } else {
            System.out.println(Arrays.toString(diagonalAr2) + " is the largest diagonal it's sum is " + sumOfDiag2);
        }
    }
}
