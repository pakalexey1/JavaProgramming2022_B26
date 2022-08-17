package practice_array_arraylist;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNum {
    public static void main(String[] args) {
        int r[] = {-1, 3, 5, 6, 7, 9, 13, 18, 70, 80, 1400, 1401, 1405};
        System.out.println(findMissingNumbs(r));
    }

    public static List<Integer> findMissingNumbs(int[] r) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < r.length-1; i++) {
            int temp = r[i]+1;
            while (temp != r[i+1]){
                if (!res.contains(temp)){
                    res.add(temp);
                    temp++;
                }
            }
        }
        return res;
    }
}


//40  FIND missing number

//    int r[]={-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};