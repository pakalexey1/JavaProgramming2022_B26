package day35_methods;

public class ContainArray {
    public static boolean doesContain(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}





/*
Contains

create a method that will accept and int array and an int number.
Check and return if the number is part of the array.
 */