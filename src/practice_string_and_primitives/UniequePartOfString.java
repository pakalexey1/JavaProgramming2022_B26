package practice_string_and_primitives;

public class UniequePartOfString {
    public static void main(String[] args) {
        String h = "AAABBBCCCDEF";
        System.out.println(uniquePartOfString(h));
    }

    public static String uniquePartOfString(String str) {

        String res = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0 ; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                   count++;
                }
            }
            if (count==1){
                res+=str.charAt(i);
            }
        }

        return res;
    }
}

/*
String h="AAABBBCCCDEF";
        String result = "";

 output
  DEF
 */