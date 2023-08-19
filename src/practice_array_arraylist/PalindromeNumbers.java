package practice_array_arraylist;

public class PalindromeNumbers {
    public static void main(String[] args) {
        int num = 1021;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int digit = 0;
        int originalNum = num;
        while (num > 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return originalNum == reverse;
    }
}
