package practice_string_and_primitives;

public class KeepUniqueChars {
    public static void main(String[] args) {
        System.out.println(keepUniqueChars("AAABBBCCC"));
    }

    public static String keepUniqueChars(String str) {

        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (!output.contains(str.charAt(i) + "")) {
                output += str.charAt(i) + "";
            }
        }
        return output;
    }
}

/*
6
String h="AAABBBCCC";
        String result = "";

output
ABC
 */