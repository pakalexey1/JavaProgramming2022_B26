package practice_array_arraylist;

public class LargestNumber {
    public static void main(String[] args) {
        Integer arr[] = {4,3,2,12,54,34,88};
        System.out.println(largestNumber(arr));
    }

    public static int largestNumber(Integer[] arr){
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxNum){
                maxNum=arr[i];
            }
        }

        return maxNum;
    }
}
