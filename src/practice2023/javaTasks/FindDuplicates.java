package practice2023.javaTasks;

public class FindDuplicates {
    public static void main(String[] args) {
        String str = "aaaaa";
        System.out.println(returnDuplicates(str));
    }

    public static String returnDuplicates(String str){

        String output = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j)==str.charAt(i)){
                    if (output.contains(str.charAt(j)+"")){
                        break;
                    }
                        output += str.charAt(j) + "";

                }
            }

        }
        return output;
    }
}
