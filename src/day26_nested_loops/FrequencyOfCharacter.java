package day26_nested_loops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String s = "appleee";
        String checked = "";
        for (int i = 0; i < s.length(); i++) {

            int count = 0; // every time the other loop iterates the counter is set back to 0. It is reset between every character
            char letter = s.charAt(i);

            if (checked.contains("" + letter)) { // checks if a character was already added to the checked string
                continue; // if character was already checked, then it will skip the repeated one and will move on to the next character in the outer loop and will check it against all the characters in the inner loop
            }
            for (int b = 0; b < s.length(); b++) {
                char eachLetter = s.charAt(b);

                if (letter == eachLetter) {
                    count++;
                }
            }
            System.out.println(letter + " - " + count);
            checked += letter;
        }
    }
}


/*
wwhat we will try to do

    we will go one character at a time and check how many times each character is listed in the string
chartAt(0) --> a
apple
a == a
a == p
a == p
a == l
a == e

charAT(1) --> p

apple
p == a
p == p
p == p
p == l
p == e

 */