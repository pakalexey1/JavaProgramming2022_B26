package tasks_from_festina.group15task_2022june06;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(4,1,3,5,0));
        System.out.println(sortDescending(arrayList));
    }
    public static ArrayList<Integer> sortDescending(ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            int temp = 0;
            for (int j = i+1; j < arrayList.size() ; j++) {
                if (arrayList.get(i)<arrayList.get(j)){
                    temp=arrayList.get(i);
                    arrayList.set(i,arrayList.get(j));
                    arrayList.set(j,temp);
                }
            }
        }

        return arrayList;
    }
}
