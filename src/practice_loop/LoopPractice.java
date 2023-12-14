package practice_loop;

import day52_inheritance.hiding.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopPractice {
    public static void main(String[] args) {
        String[]cars = {"honda","toyota","nissan"};
        for(String eachElement : cars){
            System.out.println(eachElement);
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(7);
        numbers.add(2);

        for (int eachInt : numbers){
            System.out.println(eachInt);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        String toReverse = "Makar";

        String result = "";
        for (int i = toReverse.length()-1; i >=0; i--) {
            result+=toReverse.charAt(i)+"";
        }

        System.out.println(result);



    }

    public static int sumOfDigits(String str){

return 1;

    }
}
