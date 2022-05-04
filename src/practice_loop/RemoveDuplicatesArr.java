package practice_loop;

public class RemoveDuplicatesArr {

    public static void main(String[] args) {
        System.out.println(noDuplicates("hello"));
    }

    public static String noDuplicates (String str){

        String output = "";

        for (int i = 0; i < str.length(); i++) {

            if (!output.contains(str.charAt(i)+"")){
                output+=str.charAt(i)+"";
            }
        }

        return output;
    }

}

/*

Remove duplicates from a string. Write a method that accepts one string argument and returns it without duplicates. We will see two versions of this method.
  // removeDup("hello")  -> "helo"
  // removeDup("apple")  -> "aple"
  // removeDup("aaaaaa") -> "a"
  // removeDup("abc")    -> "abc"

 */


