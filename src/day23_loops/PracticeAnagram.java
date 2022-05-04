package day23_loops;

public class PracticeAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String output = "";
        int i= 0;

        for (i = 0; i < str1.length(); i++) {

            if (str2.contains(str1.substring(i,i+1))){
                str2.replaceFirst(str1.substring(i,i+1),"*");
                output+=str1.substring(i,i+1);
            }
        }
        if (str1.equalsIgnoreCase(output) && str1.length() == str2.length()){
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams");
        }


    }
}
