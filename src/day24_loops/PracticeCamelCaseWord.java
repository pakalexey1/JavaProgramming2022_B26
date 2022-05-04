package day24_loops;

public class PracticeCamelCaseWord {
    public static void main(String[] args) {
        String sentence = "today is sunday";


        String word = "";
        int count = 0;
        String word1 = "";

        for (int i = 0; i < sentence.length(); i++) {

            word += sentence.charAt(i); //

            if (sentence.charAt(i) == ' ') { // if character = space ,we count one, this way we identify num words
                count++;

                if (count >= 2) { //it means Im starting from the third word
                    word = word.toUpperCase().charAt(0) + word.substring(1); // Sunday -> S.toUpper + the rest of the string from 0
                }
                word1 += word;
                word = "";

            }

        } //todayIsSunday
        System.out.println(word);
        word = word.toUpperCase().charAt(0) + word.substring(1);
        word1 += word;
        word1 = word1.replaceAll(" ", "");
        System.out.println(word1);
    }
}
