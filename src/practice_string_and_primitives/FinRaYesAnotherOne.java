package practice_string_and_primitives;

public class FinRaYesAnotherOne {
    public static void main(String[] args) {
        finRa(30);
    }

    public static void finRa(int num) {
        String output = "";
        for (int i = 0; i <= num; i++) {

            if (i % 5 == 0) {
                output += "Fin";
            }
            if (i % 3 == 0) {
                output += "Ra";
            }
            if (i % 3 != 0 && i % 5 != 0) {
                output += i + "";
            }
            output+="\n";

        }
        System.out.println(output);
    }
}
