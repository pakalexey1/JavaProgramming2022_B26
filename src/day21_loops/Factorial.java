package day21_loops;

public class Factorial {
    public static void main(String[] args) {

        int i = 5;
        int result = 1;

        while (i > 1) {
            System.out.println(result + "*" +i);
            result *= i--;
        }
        System.out.println(result);

    }
}
