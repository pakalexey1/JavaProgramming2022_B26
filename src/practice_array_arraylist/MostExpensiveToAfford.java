package practice_array_arraylist;

import java.util.Arrays;

public class MostExpensiveToAfford {
    public static void main(String[] args) {
        int[] arr1 = {40, 50, 60};
        int[] arr2 = {5, 8, 12};
        int b = 60;

        System.out.println(getMoneySpent(arr1, arr2, b));

    }
        public static int getMoneySpent(int[] keyboards, int[] drives, int b) {

            Arrays.sort(keyboards);
            Arrays.sort(drives);
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < keyboards.length; i++) {
                for (int j = 0; j < drives.length; j++) {
                    int sumOFTwo = keyboards[i] + drives[j];
                    if (sumOFTwo <= b) {
                        if (sumOFTwo > max) {
                            max = sumOFTwo;

                        }
                    }
                }
            }
            if(max == Integer.MIN_VALUE){
                return -1;
            }

            return max;
        }
}

/*
Link to task: https://www.hackerrank.com/challenges/electronics-shop/problem
A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget. Given price lists for keyboards and USB drives and a budget, find the cost to buy them. If it is not possible to buy both items, return -1.
 */
