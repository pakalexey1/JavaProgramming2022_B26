package codingBatWarmup1;

public class frontBack {

    public static void main(String[] args) {
        System.out.println(frontBack("a"));
    }

    public static String frontBack(String str) {

        if (str.length() == 0) {
            return "";
        } else  {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);

            if (str.length() == 1) {
                return str;
            } else if (str.length() == 2) {
                str = lastChar + "" + firstChar;
                return str;
            } else {
                String newStr = str.substring(1, str.length() - 1);
                str = lastChar + newStr + firstChar;
                return str;
            }
        }

    }

}



/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */