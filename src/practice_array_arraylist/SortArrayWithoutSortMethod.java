package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayWithoutSortMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 10, 50, 2, 4, 50, 10, 3, 2, 5, 4));
        System.out.println(sortAscendingWithoutSortMethod(list));
        System.out.println(sortDescendingWithoutSortMethod(list));
    }

    public static ArrayList<Integer> sortAscendingWithoutSortMethod(ArrayList<Integer> list) {
        Integer temp = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size() ; j++) {
                if (list.get(i) > list.get(j)) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        return list;
    }

    public static ArrayList<Integer> sortDescendingWithoutSortMethod(ArrayList<Integer> list){
        Integer temp = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)){
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, temp);
                }

            }

        }

        return list;
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
 */