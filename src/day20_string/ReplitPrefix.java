package day20_string;

public class ReplitPrefix {
    public static void main(String[] args) {

        String str = "abcabc";
        int n = 3;
        boolean doesContain = true;
        String prefix = str.substring(0,n);
        String theRest = str.substring(n);

        System.out.println(prefix + " "+theRest);

        if (theRest.contains(prefix)){
            System.out.println(doesContain);
        } else {
            System.out.println(!doesContain);
        }

    }
}


/*

Use String methods to determine if the prefix is found again somewhere later in the String. A prefix is the set of characters in the beginning of the String. To determine how long the prefix is, use the given n value. For example, if n is 2, the prefix is the first two characters, so you would check if the String from the 3rd character until the end has those two character repeating anywhere. Output the result as a boolean value, true or false.
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    abXYabc
    1
    ​
  Output:
    true
    ​
  -> 'a' is the prefix because n is 1, and the character 'a' is found again in the String "bXYabc"
Ex:
  Input:
    abXYabc
    1

  Output:
    true

  -> 'a' is the prefix because n is 1, and the character 'a' is found again in the String "bXYabc"
Ex:
  Input:
    abXYabc
    2
    ​
  Output:
    true
    ​
  -> 'ab' is the prefix because n is 2, and the characters 'ab' are found again in the String "XYabc"
Ex:
  Input:
    abXYabc
    2

  Output:
    true

  -> 'ab' is the prefix because n is 2, and the characters 'ab' are found again in the String "XYabc"
Ex:
  Input:
    abXYabc
    3
    ​
  Output:
    false
    ​
  -> 'abX' is the prefix because n is 3, and the characters 'abX' are NOT found again in the String "Yabc"

 */