package day30_arrays;

public class LongestPalindrome {
    public static void main(String[] args) {

        String [] str = {"java", "longer word", "civic", "apple",  "racecar", "mom", "anna"};
        String longestPalindrome = "";
        String palindrome = "";

        for (String eachWord: str){ // eachWord == str[i] in a traditional loop
            boolean isPalindrome = true;

            for (int i = 0; i < eachWord.length()/2; i++) { //the limit is the length of each string in str array. /2 means that it's enough to check if half of the letters are matching, for example in the word "civic" it's enough to check through letter "v".
                if (eachWord.charAt(i) != eachWord.charAt(eachWord.length()-1-i)){
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome && eachWord.length()>longestPalindrome.length()){
                longestPalindrome = eachWord;
            }

        }
        System.out.println(longestPalindrome.isEmpty() ? "No Palindrome" : longestPalindrome);

    }
}

/*
find the longest palindrome
 */