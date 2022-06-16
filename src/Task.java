import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(21,1,2,6,8,32));
        System.out.println(sortAscending(list));
    }

    public static ArrayList<Integer> sortAscending (ArrayList<Integer>list){

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)>list.get(j)){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }

        return list;
    }
}


