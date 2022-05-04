package day26_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++ ){
            for (int b = 1; b <= 10; b++) {
                System.out.print(i+" x " + b + " = "+i*b + "   |   ");
            }// end of the innter loop
            System.out.println();
        } // end of the outer loop
    }// end of main method
}


/*
print multiplication table by the numbers from 1 to 10
we will see for all numbers 1 - 10

1 x 1 = 1
1 x 2 = 2
...
2 x 1
2 x 2
...

10 x 10 = 100
 */