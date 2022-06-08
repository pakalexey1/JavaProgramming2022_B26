package tasks_from_festina.group15tasks_20220516;

public class FindMinElementArray {
    public static void main(String[] args) {
        int[] arr = {90, -2, 10, 8, 7};
        System.out.println(findMinElementArray(arr));
    }
    public static int findMinElementArray (int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<min){
                min = arr[i];
            }
        }

        return min;
    }
}


//10) Array - Find Minimum
//        Write a method that can find the maximum number from an int Array