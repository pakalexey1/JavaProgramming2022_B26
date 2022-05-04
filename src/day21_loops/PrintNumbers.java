package day21_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        /*
        print all the even number from 1=100 in seprate lines
        print all the odd numbers from 1 to 100 all in 1 line
         */

        int i = 0;
        while (i<=100 ) {
            if (i++%2!=0) {
                System.out.print(",i = " + i);
            }
        }
        System.out.println();
        System.out.println("===================");

        int iAlt = 2;
        while (iAlt<=100) {
            System.out.print(iAlt+" ");
            iAlt += 2;
        }
        System.out.println();
        System.out.println("===================");
        int a = 0;
        while (a<=100) {
            if (a++%2==0) {
                System.out.print(a+" ");
            }
        }
        System.out.println();
        System.out.println("===================");

        int aAlt = 1;
        while (aAlt <=100) {
            System.out.print(aAlt+" ");
            aAlt+=2;
        }




    }
}
