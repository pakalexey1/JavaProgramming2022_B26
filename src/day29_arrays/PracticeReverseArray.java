package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeReverseArray {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int lengthOfArray = input.nextInt();
        int[] arr = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Enter the element #" + i + " of the array");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        */
        int[] arr = {1,2,3};
        int[] newArr = new int [arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            newArr[i] = arr[i+1];
        }
        newArr[arr.length-1] = arr[0];
        System.out.println(Arrays.toString(newArr));
/*
        String arrToString = Arrays.toString(arr);
        String arrToString2 = arrToString.substring(1,arrToString.length()-1);
        String firstNumber = arrToString2.substring(0,arrToString.indexOf(",")-1);
        String arrWithFirstChar = arrToString2 + ", " + firstNumber;
        String finalResult = arrWithFirstChar.substring(3).trim();

        String[] rotatedArr = finalResult.split(", ");
        System.out.println(Arrays.toString(rotatedArr));
         */
    }
}
/*
Write a program that accepts an array and prints an array with the elements "rotated left”
		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] y = {17,12,10,8};		 // = > [12,10,8,17]
		int[] a = {7,0,0}; 			 // = > [0,0,7]
 */