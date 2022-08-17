package practice_array_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveZerosFromArray {
    public static void main(String[] args) {

        int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};

        System.out.println(removeZerosFromArray(arr));
    }

    public static ArrayList<Integer> removeZerosFromArray(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int eachElement : arr) {
            list.add(eachElement);
        }

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            if (it.next() == 0) {
                it.remove();
            }
        }

        return list;
    }
}


//    //12  Remove zeros
//    int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
//    ArrayList<Integer> list = new ArrayList<>();