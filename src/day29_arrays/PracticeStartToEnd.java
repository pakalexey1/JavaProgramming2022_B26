package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeStartToEnd {
    public static void main(String[] args) {
        int start = 5;
        int end = 10;
        String output = "";

        for (int i = start; i < end; i++) {
            output+=i + ",";
        }
        String [] arr = output.split(",");
        System.out.println(Arrays.toString(arr));
    }
}
/*
          Write a program that accepts start and end numbers. Given start and end
          numbers, return a new array containing the sequence of integers from start up to
          but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].

                Input:
                        start = 5    end = 10
                Output
                        int[] a → [5, 6, 7, 8, 9]
                Input:
                        start = 11    end = 18
                Output
                        int[] b → [11, 12, 13, 14, 15, 16, 17]

 */