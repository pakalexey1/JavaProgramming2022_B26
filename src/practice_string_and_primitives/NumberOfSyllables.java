package practice_string_and_primitives;

public class NumberOfSyllables {
    public static void main(String[] args) {
        System.out.println(numberOfSyllables("buf"));
    }

    public static int numberOfSyllables(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            String charac = str.charAt(i)+"";
            if (charac.equals("-")){
                count++;
            }
        }

        return count+1;
    }
}
/*32
Create a function that counts the number of syllables a word has. Each syllable is
separated with a dash "-" Examples
numberSyllables("buf-fet") ➞ 2

        String q="buf-dt-rr"; >> 3

 */
