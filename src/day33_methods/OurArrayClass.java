package day33_methods;

import java.util.Arrays;
import java.util.EnumSet;

public class OurArrayClass {
    public static void firstElement(int[] nums) {
        System.out.println("First Element: " + nums[0]);
    }

    public static void lastElement(int[] nums) {
        System.out.println("Last Element: " + nums[nums.length - 1]);
    }

    public static void middleElement(int[] nums) {
        if (nums.length % 2 == 0) {
            System.out.println("Middle Elements: " + nums[nums.length / 2] + " and " + nums[nums.length / 2 + 1]);
        } else {
            System.out.println("Middle Element: " + nums[nums.length / 2]);
        }
    }

    public static void printArry(int[] nums) {
        String result = "START | ";
        for (int eachNum : nums) {
            result += eachNum + " ~ ";
        }
        result += "| END";
        System.out.println(result);
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        firstElement(array);
        middleElement(array);
        lastElement(array);
        printArry(array);
        printArry(new int[]{12, 43, 54});
    }
}


/*
all will accept array argument

create a method taht will print the first element
create a method taht will print the last element
 */