package practice_string_and_primitives;

public class StringAlternatingCases {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaaaaa";
        System.out.println(alternateCases(str));
    }

    public static String alternateCases (String str){
        str = str.toLowerCase();
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (i%2==0){
                output+=str.charAt(i)+"";
            } else {
                output+=(str.charAt(i)+"").toUpperCase();
            }
        }
        return output;
    }
}
    //53
//    Write a for loop that will print out the string in alternating cases,
//        with the first letter being lowercase