package day18_string;

public class RecapMethod {
    public static void main(String[] args) {

        String s1 = "pen";
        String s2 = new String("pen");

        System.out.println("Compare with == " + (s1 == s2));
        System.out.println("Compare with .equals() " + (s1.equals(s2)));

        System.out.println("Compare with .equals() " + s1.equals("Pen"));
        System.out.println("Compare with .equalsIgnoreCase() " + s1.equalsIgnoreCase("Pen"));

        boolean isSame = s1.equalsIgnoreCase("PEN");

        if (s1.equals("pen")) {

        }

        int len = s1.length();
        System.out.println("The length of s1 is " + len);

        if (s1.length() > 4) {
            System.out.println(s1 + " is a long word");
        } else {
            System.out.println(s1 + " is a short word");
        }

    }
}
