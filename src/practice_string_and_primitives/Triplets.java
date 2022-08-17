package practice_string_and_primitives;

public class Triplets {
    public static void main(String[] args) {
        String str = "aaaa";
        System.out.println(numberOfTriplets(str));
    }

    public static int numberOfTriplets (String str){
        int count = 0;
        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(i)==str.charAt(i-1) && str.charAt(i-1) == str.charAt(i-2)){
                count++;
            }
        }
        return count;
    }
}

/*
We'll say that a "triple" in a string is a char appearing three times
 in a row. Print out the number of triples in the given string.
 The triples may overlap. Example:input: abcXXXabc output: 1
 */