package practice_string_and_primitives;

public class IsPalindrome {
    public static void main(String[] args) {
        String first="abccba";
        System.out.println(isPalindrome(first));
    }
    public static boolean isPalindrome (String str){
        String res = "";
        for (int i = str.length()-1; i >= 0; i--) {
            res+= str.charAt(i)+"";
        }

        return (str.equals(res));
    }
}
    //81
//    String first="abccba"; < palindrome
//        String second="abccbx"; < if it is not palindrome change x to a and make it palindrome