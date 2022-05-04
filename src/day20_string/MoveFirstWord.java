package day20_string;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine().trim();

        int spaceIndex = sentence.indexOf(" ");

        String firstWord = sentence.substring(0,spaceIndex);

        String noFirstWord = sentence.substring(spaceIndex+1);
        System.out.println(noFirstWord+" "+firstWord);


    }
}
