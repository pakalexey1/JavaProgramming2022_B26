package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchBadPairs {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));

        for (int i = 0; i < words.size(); i+=2) {

            String temp = words.get(i); // "Cat"
            words.set(i, words.get(i + 1)); // "stoting "in" to position i, 0
            words.set(i+1, temp); // now "in" is replaced with "Cat"

        }
    }
}

/*
Swap the positions of each pair of elements in an ArrayList

Note: The given ArrayList will always be an even number of
elements, so each number always has one pair
Ex:
Input: {"Cat", "in", "the", "hat"}
There is two pairs:
"Cat" and "in"
"the" and "hat"
Output: {"in", "Cat", "hat", "the"}
 */