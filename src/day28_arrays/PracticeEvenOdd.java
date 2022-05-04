package day28_arrays;

public class PracticeEvenOdd {
    public static void main(String[] args) {

        int[] nums = {4, 1, 3, 12, 5};
        int evens = 0;
        int odds = 0;

        for (int i = 0; i < 5; i++) {
            if (nums[i] % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        System.out.println("Evens: " + evens);
        System.out.println("Odds: " + odds);

        //another practice attempt of the same task:

        int[] nums2 = {4, 1, 3, 12, 5};
        int odds2 = 0;
        int evens2 = 0;

        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] % 2 == 0) {
                evens2++;
            } else {
                odds2++;
            }
        }
        System.out.println("Evens 2nd attempt: " + evens2);
        System.out.println("Odds 2nd attempt: " + odds2);

        int[] nums3 = {4, 1, 3, 12, 5};
        int evens3=0;
        int odds3 = 0;
        String evenNums = "";
        String oddNums = "";
        for (int number: nums2){
            if (number %2 == 0){
                evens3++;
                evenNums+=number + " ";
            }else{
                odds3++;
                oddNums+=number + " ";
            }
        }
        System.out.println("Evens 3: "+evens3);
        System.out.println("Odds 3: "+ odds3);
        System.out.println("Even numbers: "+ evenNums);
        System.out.println("Odd numbers: " + oddNums);
    }
}


/*
Even and odd from array
Write a program that can count the even and odd number from an array of
integers
Ex:
Input: [4,1,3,12,5]
Output:
Even: 2
Odd: 3
 */