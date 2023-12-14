package practice2023;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=9474;
        System.out.println(isArmstrong2(num));
        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int num){

        List<Integer> numList = new ArrayList<>();
        String numStr = num+"";

        for (int i = 0; i < numStr.length(); i++) {

            numList.add(Integer.parseInt(numStr.charAt(i)+""));
        }

        int output = 0;
        for (int i = 0; i < numList.size(); i++) {

            output += Math.pow(numList.get(i),numList.size());

        }
        return output==num;
        }

    public static boolean isArmstrong2(int num){

        int power = 0;
        int tempNum=num;
        int sum = 0;

        while(tempNum>0){
            power++;
            tempNum/=10;
        }
        tempNum = num;

        while(tempNum>0){
            int eachDigit = tempNum%10;
            tempNum /=10;

            sum+=Math.pow(eachDigit,power);
        }

        return sum==num;
        }
    }



/*
A positive integer is called an Armstrong number of order n if

abcd... = an + bn + cn + dn + ...
In case of an Armstrong number of 3 digits, the sum of cubes of each digit is equal to the number itself. For example:

153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.

371->true
9474->true
9476->false
123->false
 */