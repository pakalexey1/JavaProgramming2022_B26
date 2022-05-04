package day24_loops;

public class ReplitVowel {
    public static void main(String[] args) {

        String word = "apple";
        String vowels = "";

        for (int i = 0; i <= word.length() - 1; i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                vowels += word.charAt(i);
            }
        }
        System.out.println(vowels);

    }
}
