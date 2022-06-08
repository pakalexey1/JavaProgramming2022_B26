package practice_string_and_primitives;

import java.util.ArrayList;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(1634));
    }

    public static boolean isArmstrong(int num) {

        String numString = num + "";
        String[] numArr = numString.split("");

        int sumOfPoweredNums = 0;


        for (int i = 0; i < numArr.length; i++) {
            int raisedToPower = 1;
            //sumOfCubes += Math.pow(Integer.parseInt(numArr[i]), numArr.length);
            for (int j = 0; j < numArr.length; j++) {
                raisedToPower*=Integer.parseInt(numArr[i]);
            }
            sumOfPoweredNums+=raisedToPower;

        }

        return (num == sumOfPoweredNums);
    }
}
/*
//26
Write a method that can check if a number is Armstrong  number

Armstrong number is a number that is equal to the sum of cubes of its digits.
 For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers. Let's try to
 understand why 153 is an Armstrong number. Let's try to understand why 371 is an
  Armstrong number.
 */