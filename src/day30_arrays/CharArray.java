package day30_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char [] letters = {'j', 'a', 'v', 'a'};

        String word = "java";

        //converting a String to a char []

        char [] javaWord = word.toCharArray();
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(javaWord));

        //print every letter in my String

        for (char eachChar : javaWord) { // for (char eachChar : word.toCharArray()){
            System.out.println(eachChar);
        }
        System.out.println("===================");
        // convert a char array to a string

        char [] day = {'m','o','n','d','a','y'};
        System.out.println(day.length);

        String strDay = new String(day);
        System.out.println(strDay);
        System.out.println(strDay.toUpperCase());
        System.out.println(day); // immutibility of Strings. unless it's reassigned the string remains the same despite toUpperCase before
    }
}
