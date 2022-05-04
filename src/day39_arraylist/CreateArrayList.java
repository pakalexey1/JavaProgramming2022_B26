package day39_arraylist;

import my_utilities.ArrayUtil;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("hello");
        listOne.add("bye");
        System.out.println(listOne);

        ArrayList<String> listTwo = new ArrayList<>(listOne); // add the elements from the listOne ArrayList into the ListTwo

        listTwo.add("Hola");
        System.out.println(listOne);
        System.out.println(listTwo);

        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("one","two","three"));
        System.out.println(listThree);

        // ArrayList<String>listFour = new ArrayList<>("four","five","six"); <-- is not valid. Need to be converted into a collection type array first.

    }
}
