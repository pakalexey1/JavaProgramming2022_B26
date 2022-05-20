package tasks_from_festina.group15tasks_2022may19;

import java.util.ArrayList;
import java.util.Random;

public class SumOfIntegersIsZero {
    public static void main(String[] args) {
        System.out.println((sumOfIntegersIsZero(3)));
    }
    public static ArrayList<Integer> sumOfIntegersIsZero(int a) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int sumOfElements = 0;
        if (a > 1 && a <100) {
            for (int i = 0; i < a ; ) {
                int randomNum = (int) (Math.random() * (99 + 1 - 99 * (-1))) + 99 * (-1);
                if (!arr.contains(randomNum) && randomNum!=0) {
                    arr.add(i, randomNum);
                    sumOfElements += randomNum;
                    i++;
                }
            }
            arr.add(sumOfElements * (-1));

            return arr;
        }

        return null;
    }
}

/*
13) Array - N unique integers that sum up to 0
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
 */