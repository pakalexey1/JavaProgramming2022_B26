package day23_loops;

public class PracticeSyllables {
    public static void main(String[] args) {
        String word = "ja-va-ga-ba";

        int count = 1;

        for (int i = 0; i <= word.length()-1; i++){
            if (word.charAt(i) == '-'){
                count++;
            }
        }
        System.out.println(count);

    }
}
/*
count number of syllables separated by "-"
 */