package practice_string_and_primitives;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial (int num){
        int n=1;
        for (int i = 1; i < num; i++) {
            n*=(i+1);
        }
        return n;
    }
}

// 19. Do a factorial