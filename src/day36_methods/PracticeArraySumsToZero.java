package day36_methods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class PracticeArraySumsToZero {

    public static void main(String[] args) {
        System.out.println(arraySumsToZero(3));
    }

    public static ArrayList<Integer> arraySumsToZero(int numberOfElements) {

        ArrayList<Integer> list = new ArrayList<>();
        int random = 0;
        int count = 0;
        Random rn = new Random();


        if (numberOfElements > 1 && numberOfElements < 100) {
            while (count < numberOfElements - 1) {
                random = rn.nextInt(10);
                if (!list.contains(random)) {
                    list.add(-random);
                    count++;
                }
                random = rn.nextInt(10);
                if (!list.contains(random)) {
                    list.add(random);
                    count++;
                }
            }
            count = 0;
            for (Integer integer : list) {
                count += integer;
            }
            list.add(-count);


        }
        return list;
    }
}
/*
Task 3:  Write a method that,
                       given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
                        The method can return any such array.
                        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
                        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
                        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
 */
