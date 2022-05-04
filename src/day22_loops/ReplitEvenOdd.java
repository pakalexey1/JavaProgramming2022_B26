package day22_loops;

public class ReplitEvenOdd {
    public static void main(String[] args) {

        int even = 0;
        int odd = 0;

        while (even <19) {
            even++;
            if (even%2==0){

                System.out.print(even + " ");
            }
            }
        System.out.println(++even);
        System.out.println();
        while (odd <= 19) {
            odd++;
            if (odd % 2 == 1) {

                System.out.print(odd + " ");

            }
        }

    }
}
