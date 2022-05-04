package day30_arrays;

public class ReplitLongestWord {
    public static void main(String[] args) {

        String[] words = {"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};
        String output = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > output.length()) {
                output = words[i];
            }
        }
        System.out.println(output);

    }
}

/*
Given a String [] words, find and print the longest word in the array. You can assume the elements will have different lengths.
Note: The loop used in the given code is to dynamically create the String array. You don't need to fully understand this part yet, focus only on having access to an array.
Main topics: arrays, primitive datatypes, concatenation, index, operators. loops, if statement, String

Example:

Input:
  [aaa, bbbbb, whasstupppp, longg, jaaaaavvaaaaaaaaaa]

Output:
  jaaaaavvaaaaaaaaaa
Input:
  [aaa, bbbbb, whasstupppp, longg, jaaaaavvaaaaaaaaaa]

Output:
  jaaaaavvaaaaaaaaaa
Example:

Input:
  [five5, six666, one1111111111111, 2two, four4444]

Output:
  one1111111111111
 */