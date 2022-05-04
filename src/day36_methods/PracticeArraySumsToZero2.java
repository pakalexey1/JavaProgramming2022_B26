package day36_methods;

import my_utilities.IntUtil;

import java.util.ArrayList;

public class PracticeArraySumsToZero2 {

    public static void main(String[] args) {
        System.out.println(sumArrayElementsToZero(99));
    }

    public static ArrayList<Integer> sumArrayElementsToZero(int numberOfElements) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer sumOfElements = 0;
        Integer randomNum = 0;
        if (numberOfElements > 1 && numberOfElements < 100) {
            for (int i = 0; i < numberOfElements - 1; ) {
                randomNum = IntUtil.random_int(-numberOfElements, numberOfElements);
                if (!list.contains(randomNum)) {
                    list.add(randomNum);
                    i++;
                }
            }
            for (Integer eachElement : list) {
                sumOfElements += eachElement;
            }
            list.add(-sumOfElements);
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