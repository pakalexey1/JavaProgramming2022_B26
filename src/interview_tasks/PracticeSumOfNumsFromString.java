package interview_tasks;

import java.util.ArrayList;

public class PracticeSumOfNumsFromString {

    public static void main(String[] args) {
        System.out.println(sumOfNumsFromString("jav45ai1000sgre1at82"));
    }

    public static int sumOfNumsFromString(String str) {

        String digits = "";
        ArrayList<String> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
            } else {
                list.add(digits);
                digits = "";
            }
        }
        list.add(digits);
        for (String eachElement : list) {
            if (!eachElement.isEmpty()) {
                sum += Integer.parseInt(eachElement);
            }
        }

        return sum;
    }
}
/*
        Task 4 : Please implement this method to return the sum of all integers found in the parameter String.

                    String s="jav45ai1000sgre1at82"
                     result: 45+1000+1+82 ----> 1128
 */