package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortWithoutSortArrayMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 23, 4, 3, 123, 4, 23, 12, 43, 3));
        List<Integer> arrList = new ArrayList<>(Arrays.asList(5,564,23,5,5,6,4,63));
        System.out.println(ascendingWithoutSortArrayMethod(arr));
        System.out.println(descendingWithoutSortArrayMethod(arr));
        System.out.println("sortAscWithoutSortMethod(arr) = " + sortAscWithoutSortMethod(arr));
        System.out.println("bubbleSortAsc1(arr) = " + bubbleSortAsc1(arr));
        System.out.println("bubbleSortDesc1(arr) = " + bubbleSortDesc1(arr));
        System.out.println("bubbleSortAsc2(arr) = " + bubbleSortAsc2(arr));
        System.out.println("bubbleSortDesc2(arr) = " + bubbleSortDesc2(arr));
        System.out.println("bubbleSortAsc3(arr) = " + bubbleSortAsc3(arr));
        System.out.println("bubbleSortDesc3(arr) = " + bubbleSortDesc3(arr));
        System.out.println("bubbleSortAsc4(arr) = " + bubbleSortAsc4(arr));
    }

    public static ArrayList<Integer> ascendingWithoutSortArrayMethod(ArrayList<Integer> list) {

        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static ArrayList<Integer> descendingWithoutSortArrayMethod(ArrayList<Integer> list) {

        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static List<Integer> sortAscWithoutSortMethod(List<Integer> nums) {
        int temp = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(i) < nums.get(j)) {
                    temp = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, temp);
                }
            }
        }
        return nums;
    }

    public static List<Integer> bubbleSortAsc1(List<Integer> numList) {

        int temp = 0;
        for (int i = 0; i < numList.size(); i++) {
            for (int j = 0; j < numList.size(); j++) {

                if (numList.get(i)<numList.get(j)){
                    temp=numList.get(i);
                    numList.set(i,numList.get(j));
                    numList.set(j,temp);
                }
            }
        }

        return numList;
    }

    public static List<Integer> bubbleSortDesc1(List<Integer> nums){
        int temp = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(i)> nums.get(j)){
                    temp=nums.get(i);
                    nums.set(i,nums.get(j));
                    nums.set(j,temp);
                }
            }
        }

        return nums;
    }

    public static List<Integer> bubbleSortAsc2(List<Integer> list){

        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {

                if (list.get(i)<list.get(j)){
                    temp=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }

        return list;
    }

    public static List<Integer> bubbleSortDesc2(List<Integer> nums){
        int temp = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(i)>nums.get(j)){
                    temp = nums.get(i);
                    nums.set(i,nums.get(j));
                    nums.set(j,temp);
                }
            }
        }

        return nums;
    }

    public static List<Integer> bubbleSortAsc3(List<Integer>nums){
        int temp = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(i)<nums.get(j)){
                    temp = nums.get(i);
                    nums.set(i,nums.get(j));
                    nums.set(j,temp);
                }
            }
        }

        return nums;
    }

    public static List<Integer> bubbleSortDesc3(List<Integer> nums){
        int temp = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(i)>nums.get(j)){
                    temp = nums.get(i);
                    nums.set(i,nums.get(j));
                    nums.set(j,temp);
                }
            }
        }

        return nums;
    }

    public static List<Integer> bubbleSortAsc4 (List<Integer> nums){

        int temp = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(i)<nums.get(j)){
                    temp = nums.get(i);
                    nums.set(i,nums.get(j));
                    nums.set(j,temp);
                }
            }
        }

        return nums;
    }
}



/*
5.
Don't use sort method
ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(1,10, 50, 2, 4, 50, 10, 3, 2,5, 4));
first
output
[1, 2, 2, 3, 4, 4, 5, 10, 10, 50, 50]

second
[50, 50, 10, 10, 5, 4, 4, 3, 2, 2, 1]

---------------SECOND------------
Store into Array
2int[] arr = {1, 2, 3, 49, 6, 5};
ArrayList<Integer> list = new ArrayList();

 */