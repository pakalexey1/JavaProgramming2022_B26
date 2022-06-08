package tasks_from_festina.group15task_20220606;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,6,2,8,9,-1,3));
        System.out.println(sortAscending(arrayList));
    }

    public static ArrayList<Integer> sortAscending(ArrayList<Integer> arrayList) {

        int temp = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i+1; j < arrayList.size(); j++) {
                if (arrayList.get(i)> arrayList.get(j)){
                    temp = arrayList.get(i);
                    arrayList.set(i,arrayList.get(j));
                    arrayList.set(j,temp);
                }
            }
        }

        return arrayList;
    }
}
