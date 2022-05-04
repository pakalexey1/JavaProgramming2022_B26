package day23_loops;

public class PracticeRemoveDuplicates {
    public static void main(String[] args) {

        String word = "abcabcabc";
        String output="";

        for (int i = 0; i < word.length();i++){
          if (!output.contains(""+word.charAt(i))){
            output+= word.charAt(i);
            }
        }
        System.out.println(output);
    }
}

/*
remove duplicated series of charaters, e.g. abcabc -> abc
 */
