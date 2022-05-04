package day20_string;

public class ReplitReverseIt {
    public static void main(String[] args) {

        String word = "kilo";

        if (word.length()>5){
            System.out.println("Too long!");
        }else if (word.length()<5){
            System.out.println("Too short!");
        }else {
            char five = word.charAt(4);
            char four = word.charAt(3);
            char three = word.charAt(2);
            char two = word.charAt(1);
            char one = word.charAt(0);
            System.out.println("" + five + four + three + two + one);
        }

    }
}


/*
Use String methods and if statements to reverse a String that is five characters long. If the given word is not five characters long, it will not be reversed. Use the following to output a value:
If the word is less than 5 characters: print Too short!
If the word is more than 5 characters: print Too long!
If the word is 5 characters: print the reversed version of the String. Reading characters from the end to the beginning.
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

Ex:
  Input:
    cat
    ​
  Output:
    Too short!
Ex:
  Input:
    cat

  Output:
    Too short!
Ex:
  Input:
    singularity
    ​
  Output:
    Too long!
Ex:
  Input:
    singularity

  Output:
    Too long!
Ex:
  Input:
    apple
    ​
  Output:
    elppa
 */