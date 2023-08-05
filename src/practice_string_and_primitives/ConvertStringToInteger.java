package practice_string_and_primitives;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        String str = "5243523";
        System.out.println(convertStringToInt(str));
    }

    public static String convertStringToInt(String str) {
        int res = 0;
        String out = "";
        int temp = 1;
        for (int i = str.length()-1; i >= 0; i--) {

            if(str.charAt(i)>'0' && str.charAt(i)<='9'){
                res+=temp*(str.charAt(i)-48);
                temp*=10;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.reverse();
        out = str;
        return out  ;
    }
}

/*
    write a program that can convert a string to integer. DO NOT use parse or valueOf methods
     */