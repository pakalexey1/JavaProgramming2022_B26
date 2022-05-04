package day24_loops;

public class PracticeMultiplyEnd {
    public static void main(String[] args) {

        String str = "java";
        int num = 5;
        String output = "";

        for (int i = 0; i < num; i++) {

            output+=str.charAt(str.length()-1);

        }

        System.out.println(str+output);

    }
}
/*
Given a String and a number return a String that has the ending character
duplicated and attached by the number amount of times
Ex:
Input:
Hello?
3
Output:
Hello????
Ex:
Input:
java
5
Output:
javaaaaaa
 */