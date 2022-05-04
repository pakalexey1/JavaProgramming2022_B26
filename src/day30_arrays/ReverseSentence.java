package day30_arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "today is monday";
        String [] eachWord = str.split(" ");
        String reverse ="";
        for (int i = eachWord.length-1; i >= 0; i--) {
            reverse+=eachWord[i]+" ";

        }
        System.out.println(reverse);
    }
}
/*
    given a sentence
    today is monday

    reverse the sentence
    monday is today
     */
