package tasks_from_festina.group15tasks_20220616;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(sameLetters("babcc", "cabb"));
    }

    public static boolean sameLetters(String str1, String str2) {

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str2.contains(str1.charAt(i) + "")) {
                    str2 = str2.replaceFirst(str1.charAt(i) + "", "");

                } else {
                    return false;
                }
            }
        }
        return str2.isEmpty();
    }
}


/*
2.    String - Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
 */
