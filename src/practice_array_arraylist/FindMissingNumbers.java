package practice_array_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
//TODO
public class FindMissingNumbers {
    public static void main(String[] args) {
        int r[]={-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};
        System.out.println(missingNumbers(r));
    }

    //My way
    public static ArrayList<Integer> missingNumbers (int[]arr){
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] - arr[i] != 1) {
                for (int j = 0; j < (arr[i+1]-arr[i]-1); j++) {
                    output.add(arr[i]+j);
                }
            }
        }

        return output;
    }
    //Vika way
    public static ArrayList<Integer> missingNums(int [] arr){

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            int num = arr[i] + 1;
            while (num != arr[i+1]){
                if (!res.contains(num)){
                    res.add(num);
                    num++;
                }
            }

        }
        return res;
    }
}

/*
//40  FIND missing number

 int r[]={-1,3,5,6,7,9,13,18,70,80,1400,1401,1405};
 */