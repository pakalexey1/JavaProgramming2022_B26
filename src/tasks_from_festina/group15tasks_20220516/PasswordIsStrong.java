package tasks_from_festina.group15tasks_20220516;

public class PasswordIsStrong {
    public static void main(String[] args) {
        String password = "asdf";
        System.out.println(passwordIsStrong(password));
    }
    public static boolean passwordIsStrong(String password) {

        int countUpper = 0;
        int countLower = 0;
        int countDigits = 0;
        int countSpecial = 0;
        if (password.length() >= 6 && !password.contains(" ")) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    countUpper++;
                }
                if (Character.isLowerCase(password.charAt(i))) {
                    countLower++;
                }
                if (Character.isDigit(password.charAt(i))) {
                    countDigits++;
                }
                if (password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '%' || password.charAt(i) == '^' || password.charAt(i) == '&' || password.charAt(i) == '*' || password.charAt(i) == '(' || password.charAt(i) == ')') {
                    countSpecial++;
                }
            }
            if (countDigits > 0 && countLower > 0 && countUpper > 0 && countSpecial > 0) {
                return true;
            }
        }

        return false;
    }
}
/*
7) String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false
 */