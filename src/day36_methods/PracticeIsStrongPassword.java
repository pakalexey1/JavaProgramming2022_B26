package day36_methods;

public class PracticeIsStrongPassword {

    public static void main(String[] args) {
        System.out.println(isStrongPassword("Assfdsd3"));
    }

    public static boolean isStrongPassword(String password) {
        int countOfUpper = 0;
        int countOfLower = 0;
        int countOfDigit = 0;
        int countOfSpecial = 0;
        if (password.length() >= 8 && !password.contains(" ")) {

            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    countOfUpper++;
                }
                if (Character.isLowerCase(password.charAt(i))) {
                    countOfLower++;
                }
                if (Character.isDigit(password.charAt(i))) {
                    countOfDigit++;
                }
                if (password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%") || password.contains("^")) {
                    countOfSpecial++;
                }

            }

            return countOfUpper > 0 && countOfLower > 0 && countOfDigit > 0 && countOfSpecial > 0;
        }

        return false;
    }
}

/*
        Task 5: Write a method that can verify if a password is a strong password. Characteristics of strong passwords are:
                       1.1 Password must be at least have 8 characters long, and should not contain space
                       1.2 PassWord should at least contain one upper case letter
                       1.3 PassWord should at least contain one lower case letter
                       1.4 Password should at least contain one special characters
                       1.5 Password should at least contain a digit

 */