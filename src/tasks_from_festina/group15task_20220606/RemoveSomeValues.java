package tasks_from_festina.group15task_20220606;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveSomeValues {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>(Arrays.asList(1,2,5,1231,2,654,21,3135,1531351,1,5131,351513,21));
        System.out.println(removeSomeValues(arrayList));
    }
    public static ArrayList<Integer> removeSomeValues(ArrayList<Integer> arrayList){
        Iterator<Integer> it = arrayList.iterator();

        while(it.hasNext()){
            if (it.next()>100){
                it.remove();
            }
        }
        return arrayList;
    }
}

/*
26) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */