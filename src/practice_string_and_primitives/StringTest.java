package practice_string_and_primitives;

public class StringTest {
    public static void main(String[] args) {
        String S1 = "Nisum";
        String S2 = new String(S1);
        String S3 = "Nisum"+"";// => "Nisum"
        String S4 = "";
        String S5 = "Nisum"+S4;
        System.out.println("S5==S3: " + (S5==S3));
        System.out.println(S1.equals(S2));
        System.out.println("S1==S2: " + (S1==S2));
        System.out.println("S3==S1: " + (S3==S1));
    }
}
