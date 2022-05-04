package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumsToSum {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1231", "232", "3435"));
        System.out.println(stringNumsToSum(list));
    }

    public static ArrayList<Integer> stringNumsToSum(ArrayList<String> nums) {

        ArrayList<Integer> sums = new ArrayList<>();

        for (String each : nums) {
            int currentSum = 0;
            for (String eachDigit : each.split("")) { //converts each element of the ArrayList nums into an ArrayList  split by an empty space: "123" -> ["1", "2", "3"]

                currentSum += Integer.parseInt(eachDigit);

            }

            sums.add(currentSum);

        }

        return sums;
    }
}
