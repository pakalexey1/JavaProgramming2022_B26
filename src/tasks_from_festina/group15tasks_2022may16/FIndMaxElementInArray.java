package tasks_from_festina.group15tasks_2022may16;

public class FIndMaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {-1, -1000, 8, -7};
        System.out.println(finMaxElementArray(arr));
    }
    public static int finMaxElementArray(int[] arr) {

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }
}
/*
9) Array - Find Maximum
Write a method that can find the maximum number from an int Array
 */