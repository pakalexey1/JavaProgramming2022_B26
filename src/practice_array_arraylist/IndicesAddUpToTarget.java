package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndicesAddUpToTarget {
    public static void main(String[] args) {
        List<Integer> arrayList = List.of(1,3,4,3,0);
        int target = 4222;

        System.out.println(IndicesAddUp(arrayList, target));
    }

    public static List<Integer> IndicesAddUp (List<Integer> arrayList, int target){
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 1; j < arrayList.size(); j++) {
                if (arrayList.get(i)+arrayList.get(j)==target){
                    output.add(i);
                    output.add(j);
                    return output;
                }
            }
        }
        return output;
    }
}


/*
Given an array list of integer nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
 */