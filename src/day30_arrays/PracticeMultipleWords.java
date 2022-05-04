package day30_arrays;

import java.util.Arrays;

public class PracticeMultipleWords {
    public static void main(String[] args) {
        String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] strArr = str.split(", ");
        //System.out.println(Arrays.toString(strArr));
        for (String word : strArr) {
            if (word.contains(" ")) {
                System.out.println(word);
            }
        }
    }
}

/*Multiple Words
Given a String of words that are separated by commas. Find and print any words that have more than one word
Example

	Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”
	Output:
	wooden spoons
	trash can
	dish washer

 */