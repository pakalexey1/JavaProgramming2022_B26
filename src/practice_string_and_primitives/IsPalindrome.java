package practice_string_and_primitives;

public class IsPalindrome {
    public static void main(String[] args) {
        String first="abcc !Ba";
        System.out.println(isPalindrome(first));
    }
    public static boolean isPalindrome (String str){
        String str2 = str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        String output="";
        for (int i = str2.length()-1; i >=0 ; i--) {
            output+=str2.charAt(i);
        }

        return output.equals(str2);
    }
}
    //81

//    Make sure to ignore the special characters, spaces and capitalization of the letters
//    String second="abccbx"; < if it is not palindrome change x to a and make it palindrome
//    String first="abcc! Ba"; < palindrome