package practice_string_and_primitives;

public class Anagram {
    public static void main(String[] args) {
        String a = "abc";
        String b = "caa";

        System.out.println(isAnagram(a,b));
    }

    public static boolean isAnagram(String a, String b){
        String[] arrA = a.toLowerCase().split("");
        String[] arrB = b.toLowerCase().split("");

        return arrA.equals(arrB);
    }
}
            /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:
     */