package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNumsGreaterThan {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,5,74,6,65,87654,65,6854,65,4));
        System.out.println("removeGreaterThanNum(list) = " + removeGreaterThanNum(list,100));
    }
    public static List<Integer> removeGreaterThanNum (List<Integer> list, int num){

        Iterator <Integer> it = list.iterator();

        while(it.hasNext()){
            if (it.next()>=num){
                it.remove();
            }
        }
        return list;
    }
}
