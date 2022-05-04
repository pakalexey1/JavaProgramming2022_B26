package interview_tasks;

import java.util.Arrays;

public class PracticeFibonacci {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibo(0)));
    }

    public static int[] fibo(int number) {

        int[] fiboArr = new int[number];

        if (number > 1) {

            fiboArr[0] = 0;
            fiboArr[1] = 1;

            for (int i = 2; i < number; i++) {

                fiboArr[i] = (fiboArr[i - 1]) + (fiboArr[i - 2]);
            }

            return fiboArr;
        } else if (number == 1) {
            fiboArr[0] = 0;
            return fiboArr;
        } else {

            return fiboArr;
        }

    }
}
