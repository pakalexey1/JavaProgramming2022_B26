package day18_string;

public class RemoveSpacesTrim {
    public static void main(String[] args) {

        String s = "   Saturday    ";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.trim());

        String str = "        java is fun     ";
        System.out.println(str.startsWith("java"));//false
        str = str.trim();
        System.out.println(str.startsWith("java"));//true because str was reassigned with a trimmed version

    }
}
