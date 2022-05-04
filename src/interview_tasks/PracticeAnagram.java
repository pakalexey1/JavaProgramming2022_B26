package interview_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PracticeAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagramArrList("silent","listen"));
        System.out.println(isAnagramStr("silent","listen")  );
    }

    public static boolean isAnagramArrList (String word1, String word2){

        ArrayList<String> word1Arr = new ArrayList<>(Arrays.asList(word1.split("")));
        ArrayList<String> word2Arr = new ArrayList<>(Arrays.asList(word2.split("")));

        Collections.sort(word1Arr);
        Collections.sort(word2Arr);

        return word1Arr.equals(word2Arr);

    }

    public static boolean isAnagramStr (String word1, String word2){

        if (word1.length() == word2.length()){
            for (int i = 0; i < word1.length(); i++) {
                if (word2.contains(word1.charAt(i)+"")) {
                    word2 = word2.replaceFirst(word1.charAt(i) + "", "");
                }
            }

            return word2.isEmpty();
        }

        return false;
    }
}
