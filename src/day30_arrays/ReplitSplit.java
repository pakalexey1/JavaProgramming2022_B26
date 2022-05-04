package day30_arrays;

public class ReplitSplit {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        String [] eachWord = sentence.split(" ");
        for (int i = 0; i < eachWord.length; i++) {
            System.out.println(eachWord[i]);
        }
    }
}
