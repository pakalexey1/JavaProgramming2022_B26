package practice_array_arraylist;

public class CompareFirstLastElemsOfTwoArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,2};
        int[] b = {21,34,123,1,545,5,2};
        System.out.println(firstAndLastElemsAreSame(a,b));
    }
    public static boolean firstAndLastElemsAreSame(int[]a, int[]b){

        return  (a[0]==b[0] || a[a.length-1] == b[b.length-1]);

    }
}
//Given 2 arrays of ints, a and b, return true if
//they have the same first element or they have the same last element.
//Both arrays will be length 1 or more.