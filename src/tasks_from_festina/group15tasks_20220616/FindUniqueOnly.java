package tasks_from_festina.group15tasks_20220616;

public class FindUniqueOnly {

    public static void main(String[] args) {
        System.out.println(findUnique("ABABBBCCCDEF"));
    }
    public static String findUnique(String str){

        String output = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (count==1){
                output+=str.charAt(i)+"";
            }
        }

        return output;
    }

}
/*
4.    String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("ABABBBCCCDEF") ==> "DEF";
 */