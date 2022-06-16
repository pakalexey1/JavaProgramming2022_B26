package practice_array_arraylist;

import java.util.ArrayList;

public class CombineArrays {
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b ={3,4};

        System.out.println(combinedArrays(a,b));
    }

    public static ArrayList<Integer> combinedArrays (int [] a, int []b){

        ArrayList <Integer> output = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            output.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            output.add(b[i]);
        }

        return output;
    }
}

/*
//44  COMBINE
        int[] a = {1,2};
        int[] b ={3,4};

        output
     [1, 2, 3, 4]

=========================================================================
  ---WHAT IS OUTPUT----
        String S1 = "Nisum";
        String S2 = new String(S1);
        String S3 ="Nisum";
        System.out.println((S1.equals(S2)));
        System.out.println(S1==S2);
        System.out.println((S3==S1));
 */