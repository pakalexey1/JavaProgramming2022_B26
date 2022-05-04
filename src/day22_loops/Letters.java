package day22_loops;

public class Letters {
    public static void main(String[] args) {

        char lowercaseUp = 'a';
        while (lowercaseUp <= 'z') {
            System.out.print(lowercaseUp + " ");
            lowercaseUp++;
        }
        System.out.println();
        char uppercaseDown = 'Z';
        while (uppercaseDown >= 'A') {
            System.out.print (uppercaseDown + " ");
            uppercaseDown--;
        }
    }
}
