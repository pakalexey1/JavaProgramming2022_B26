package day24_loops;

public class ReplitCountTriples {
    public static void main(String[] args) {

        String str = "xxxabyyyycddd";
        int count = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i)==str.charAt(i+1) && str.charAt(i+1) ==str.charAt(i+2)){
                count++;
            }
        }
        System.out.println(count);

    }
}
