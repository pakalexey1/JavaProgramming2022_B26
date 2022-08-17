package practice_string_and_primitives;

public class PasswordVerification {
    public static void main(String[] args) {
        String str = "a1@Aff";
        System.out.println(passwordVerification(str));
    }

    public static boolean passwordVerification(String str) {
        int upperCase = 0;
        int lowerCase = 0;
        int special = 0;
        int digit = 0;

        if (str.length() >= 6) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    upperCase++;
                }
                if (Character.isLowerCase(str.charAt(i))) {
                    lowerCase++;
                }
                if (Character.isDigit(str.charAt(i))){
                    digit++;
                }
                if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))){
                    special++;
                }
            }
            if (upperCase>0 && lowerCase>0 && digit>0 && special>0){
                return true;
            }
        }
        return false;
    }
}

/*
//19
1. Write a return method that can verify if a password is valid or not.
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
 */
