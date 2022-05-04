package day18_string;

public class StartsEnds {
    public static void main(String[] args) {
        String str="Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        System.out.println(str.startsWith("Apples"));

        String s = "App";
        System.out.println(str.startsWith(s));// checking if String str start with String s

        System.out.println(str.startsWith(" App")); // false, since the str doesn't start with a space
        System.out.println(str.startsWith(   "App")); // true, since space is in the code, not in the quotes

        System.out.println(str.startsWith("Aoo"));

        String sentence = "today was a good day";
        System.out.println(sentence.endsWith("day")); // true
        System.out.println(sentence.endsWith(" day")); // true
        System.out.println(sentence.endsWith("good")); // false
        System.out.println(sentence.endsWith("today was a good day"));// true
    }
}
