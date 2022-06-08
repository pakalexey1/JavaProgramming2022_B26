package practice_array_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class iteratorRemoveLargeNums {
    public static void main(String[] args) {

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 570, 700, 4000, 5, 6, 600, 7, 800, 9, 101, 200
                , 300)) ;
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 570, 700, 4000, 5, 6, 600, 7, 800, 9, 101, 200
                , 300)) ;
        System.out.println(iteratorRemoveLargeNums(list3));
        System.out.println(removeLargeNums(list4));

    }
    public static ArrayList<Integer> iteratorRemoveLargeNums(ArrayList<Integer> list){
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if (it.next() >= 100){
                it.remove();
            }
        }
        return list;
    }

    //without Iterator - will not always work due to shifting indexes
    public static ArrayList<Integer> removeLargeNums (ArrayList<Integer> list1){
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i)>=100){
                list1.remove(i);
            }
        }
        return list1;
    }

}

/*
//25 USE ITERATOR
ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
 */
