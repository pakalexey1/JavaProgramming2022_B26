package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeAvgNumFromArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers are in an array?");
        int numsInArray = input.nextInt();

        System.out.println("Enter " + numsInArray + " numbers one after another");
        int[] nums = new int[numsInArray];
        int output = 0;

        for (int i = 0; i < numsInArray; i++) {
            nums[i] = input.nextInt();
            output += nums[i];
        }
        System.out.println("Average: " + output / numsInArray);

        //another practice attempt of the same:
        int [] nums2 = {10,20,35};
        int sum2 = 0;

        for (int i = 0; i < nums2.length; i++) {
            sum2+=nums2[i];
        }
        System.out.println("The average is: "+(sum2/nums2.length));



    }
}

/*
Average Number from Array
Given an int array calculate the average number
-> Make it flexible so it will work with any array size
Examples:
[1,2,3] -> average: 2
[10, 15, 5, 6] -> average: 9
[4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
 */