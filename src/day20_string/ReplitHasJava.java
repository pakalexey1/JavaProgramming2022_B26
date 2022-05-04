package day20_string;

public class ReplitHasJava {
    public static void main(String[] args) {
        String word = "cvjava";
        boolean isJava = true;
        if (word.length()>=4) {
            if (word.substring(0, 4).equals("java") || word.substring(1, 5).equals("java")) {
                System.out.println(isJava);
            } else {
                System.out.println(!isJava);
            }
        } else {
            System.out.println(!isJava);
        }
    }
}
