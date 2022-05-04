package day18_string;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "sNOw";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str); // the String didn't change and still printed as sNOw


        String word = "HELLO";
        word.toLowerCase();
        System.out.println(word); // will still print HELLO, because String can't be changed, but reassigned, e.g. word = word.toLowerCase()

        int i = 4;
        i++;
        System.out.println(i); // here the integer was changed with i++ and the output is 5
    }
}
