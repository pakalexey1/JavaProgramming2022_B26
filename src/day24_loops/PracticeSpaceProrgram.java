package day24_loops;

public class PracticeSpaceProrgram {
    public static void main(String[] args) {

        String str = "java is cool";
        String output ="";

        for (int i = 0; i < str.length(); i++) {

           if (str.charAt(i) != ' '){
               output+=str.charAt(i)+" ";
           }else{
               output+="_ ";
           }

        }
        System.out.println(output);
    }
}

/*
Space program [String, Loops]
Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore
Ex: java -> j a v a
space -> s p a c e
more words -> m o r e _ w o r d s

 */
