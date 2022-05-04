package day20_string;

public class ReplitMergeStrings {
    public static void main(String[] args) {

        String word1 = "ard";
        String word2 = "sdsa";

        if (word1.length()==3 && word2.length() == 3 ) {
            char word1First = word1.charAt(0);
            char word1Second = word1.charAt(1);
            char word1third = word1.charAt(2);
            char word2First = word2.charAt(0);
            char word2Second = word2.charAt(1);
            char word2Third = word2.charAt(2);
            System.out.println(""+word1First+word2First+word1Second+word2Second+word1third+word2Third);

        }else{
            System.out.println("cannot merge");
        }




    }
}

/*
Use String methods and if statements to combine the two given String variables, word1 and word2 together, but only combine them if the Strings are only three character long. If either String is not three characters long, do not merge them together and instead print cannot merge. If both Strings are three characters long then merge them together in the following format and print the merged String:
The Strings will be merged by taking the first character of the first word, then the first character of the second word, then the second character of the first word, etc...
Hint: Concatenating any type with a String, converts the type to a String
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

Ex:
  Input:
    aok
    lol
    ​
  Output:
    alookl
Ex:
  Input:
    aok
    lol

  Output:
    alookl
Ex:
  Input:
    ear
    pie
    ​
  Output:
    epaire
Ex:
  Input:
    ear
    pie

  Output:
    epaire
Ex:
  Input:
    java
    wow
    ​
  Output:
    cannot merge
 */