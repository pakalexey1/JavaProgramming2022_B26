package practice_string_and_primitives;

public class DivideWithoutDivider {
    public static void main(String[] args) {
        System.out.println(divideWithoutDivider(8, 2));
    }

    public static int divideWithoutDivider(int a, int b) {
        int count = 0;
        if (b != 0) {
            while (a >= b) {
                a = a - b;
                count++;
            }
        } else {
            return 0;
        }

        return count;
    }
}

