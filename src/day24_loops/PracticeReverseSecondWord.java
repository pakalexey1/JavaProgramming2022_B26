package day24_loops;

public class PracticeReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I love java";
        String output = "";
        String middle = sentence.substring(sentence.indexOf(" ")+1,sentence.lastIndexOf(" "));
        String firstPart = sentence.substring(0,sentence.indexOf(" ")+1);
        String lastPart = sentence.substring(sentence.lastIndexOf(" "));


        for (int i = 1; i < middle.length()+1; i++){
                output += middle.charAt(middle.length() - i);
        }

        System.out.println(firstPart+output+lastPart);

    }
}

/*
Reverse only second word [String, Loops]
Given a String with three words separated by spaces. Reverse only the
second word and return the modified String
Ex:
I love java
Ouput:
I evol java
 */