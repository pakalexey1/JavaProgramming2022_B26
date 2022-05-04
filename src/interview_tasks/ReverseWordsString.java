package interview_tasks;

public class ReverseWordsString {

    public static void main(String[] args) {

        System.out.println(reverseWordOrder("I am John Doe"));

    }
    public static String reverseWordOrder(String str) {

        String[] sentence = str.split(" ");
        String result = "";

        for (int i = sentence.length - 1; i >= 0; i--) {
            result += sentence[i] + " ";
        }

        return result.trim();
    }
}

/*

Reverse words. Write a method that will take a string as an argument. The method will reverse the position of words and return it.
String sentence = "I am John Doe";

 */
