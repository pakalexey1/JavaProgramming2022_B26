package practice_string_and_primitives;

public class SwapStrings {
    public static void main(String[] args) {
        System.out.println(swapString("No","Cybertek"));
    }
    public static String swapString (String a, String b){
        a=a+b;
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
       return "a = " + a + "\nb = " + b;
    }
}
