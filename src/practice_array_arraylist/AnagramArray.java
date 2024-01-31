package practice_array_arraylist;

import java.util.*;

public class AnagramArray {
    public static void main(String[] args) {
        String g = "abca";
        String h = "caab";

        System.out.println(anagramArray(g, h));

        System.out.println("isAnagram(g,h) = " + isAnagram(g, h));

        System.out.println(isAnagramArray(g,h));

        System.out.println(isAnagramList(g,h));

        System.out.println(isAnagramTwoMore(g,h));

        System.out.println("newAnagramTest(g,h) = " + newAnagramTest(g, h));
    }

    public static boolean anagramArray(String a, String b) {

        if (a.length() == b.length()) {
            String[] arr = a.split("");
            String[] arr2 = b.split("");

            Arrays.sort(arr);
            Arrays.sort(arr2);
            return Arrays.equals(arr, arr2);
        } else {
            return false;
        }
    }

    public static boolean isAnagram(String a, String b){

        if (a.length() == b.length()) {
            List<String> arrayA = new ArrayList<>(Arrays.asList(a.split("")));
            List<String> arrayB = new ArrayList<>(Arrays.asList(b.split("")));
            Collections.sort(arrayA);
            Collections.sort(arrayB);
            return  arrayA.equals(arrayB);
        }

        return false;
    }
//practice array
    public static boolean isAnagramArray(String a, String b){

        if (a.length()==b.length()){
            String[] arrayA = a.split("");
            String[] arrayB = b.split("");
            Arrays.sort(arrayA);
            Arrays.sort(arrayB);
            return Arrays.equals(arrayA,arrayB);
        }else {

            return false;
        }
    }

    //practice collections
    public static boolean isAnagramList(String a, String b){

        if (a.length() == b.length()){

            List<String> listA = new ArrayList<>(Arrays.asList(a.split("")));
            List<String> listB = new ArrayList<>(Arrays.asList(b.split("")));
            Collections.sort(listA);
            Collections.sort(listB);

            return listA.equals(listB);
        }

        return false;
    }

    public static boolean isAnagramTwoMore(String a, String b){

        if (a.length() == b.length()) {
            List<String> aList = new ArrayList<>(Arrays.asList(a.split("")));
            List<String> bList = new ArrayList<>(Arrays.asList(b.split("")));

            Collections.sort(aList);
            Collections.sort(bList);
            return aList.equals(bList);

        }

        return false;
    }

    public static boolean isAnangram1 (String a, String b){

        List<String> listA = new ArrayList<>(Arrays.asList(a.split("")));
        List<String> listB = new ArrayList<>(Arrays.asList(b.split("")));

        Collections.sort(listA);
        Collections.sort(listB);

        return listA.equals(listB);
    }

    public static boolean newAnagramTest (String a, String b){
        List<String> listA = new ArrayList<>(Arrays.asList(a.split("")));
        List<String> listB = new ArrayList<>(Arrays.asList(b.split("")));

        Collections.sort(listA);
        Collections.sort(listB);

        return listA.equals(listB);
    }
}

/*
use Array sort
Write a return method that check if a string is build out of the same letters as another string.
   String g="abc";
   String h="cab";
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
 */
