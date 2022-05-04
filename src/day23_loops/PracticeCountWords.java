package day23_loops;

public class PracticeCountWords {
    public static void main(String[] args) {

        String sentence = "This has multiple words and words";
        char space = ' ';
        int result = 1;

        for (int i = 0; i<=sentence.length()-1;i++ ) {
            if (sentence.charAt(i)==' ') {
                result++;
            }
        }
        System.out.println(result);

    }
}
