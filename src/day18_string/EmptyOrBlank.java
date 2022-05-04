package day18_string;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "last example";
        System.out.println(str.isEmpty());//false

        str = "";
        System.out.println(str.isEmpty()); //true

        String s = " ";
        System.out.println("isEmpty"+s.isEmpty());// false because space is a character

        System.out.println("isBlank: " + s.isBlank());// true as isBlank doesn't count spaces



    }
}
