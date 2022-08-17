package practice_string_and_primitives;

public class ReverseString {
    public static void main(String[] args) {
        String str= "лешанаполкеклопанашел";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){
        String output = "";
        for (int i = str.length()-1; i >=0; i--) {
            output+=str.charAt(i)+"";
        }

        return output;
    }
}

