package tasks_from_festina.group15tasks_20220519;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        Integer[] array = {1,0,2,0,3,0,4,0};
        System.out.println(moveZerosToEnd(array));
    }

    public static ArrayList <Integer> moveZerosToEnd (Integer[] a) {

        ArrayList <Integer> aList = new ArrayList<>(Arrays.asList(a));
        ArrayList<Integer> forNonZeros = new ArrayList<>();
        ArrayList<Integer> forZeros = new ArrayList<>();

        for (int i = 0; i < aList.size(); i++) {
            if (aList.get(i)==0){
                forZeros.add(aList.get(i));
            }else{
                forNonZeros.add(aList.get(i));
            }
        }

        forNonZeros.addAll(forZeros);
        return forNonZeros;
    }
}


/*

15) Array - Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]

 */