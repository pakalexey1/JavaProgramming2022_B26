package interview_tasks;

public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome (int number){

       String strNumber = String.valueOf(number);
       String reverseStrNumber = "";

        for (int i = strNumber.length()-1; i >=0 ; i--) {
            reverseStrNumber += strNumber.charAt(i);
        }
        return strNumber.equalsIgnoreCase(reverseStrNumber);
    }
}
/*

Number palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.
The straight forward solution would be to convert number to string and use the above approach.
Some interviewers will not allow it. So let’s take a look at what we can do here.

  // isPalNum(545)   -> true
  // isPalNum(1001)  -> true
  // isPalNum(13)    -> false
  // isPalNum(33)    -> true

 */