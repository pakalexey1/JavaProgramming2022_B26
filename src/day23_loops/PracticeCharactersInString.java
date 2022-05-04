package day23_loops;

public class PracticeCharactersInString {
    public static void main(String[] args) {

        String word = "java";

        for (int i = 0; i<=word.length()-1; i++) {
            System.out.print((int)word.charAt(i)+" ");
        }

    }
}
