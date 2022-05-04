package day22_loops;

public class PracticeFinRa {
    public static void main(String[] args) {
        int number =20;
        String output = "";

        for (int i = 1; i <= number; i++) {
            if (i%3==0 || i%5 == 0) {
                if (i % 3 == 0) {
                    output+="FIN ";
                }
                if (i % 5 == 0) {
                    output+="RA ";
                }
            }else {
                output+=i+" ";
            }
        }
        System.out.println(output);
    }
}
/*
Write a method which prints out the numbers from 1 to 100

            but
                for numbers which are a multiple of 3, print "FIN" instead of the number
                for numbers which are a multiple of 5, print "RA" instead of the number.
                for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,

                    ex:
                        input : 100
                        output:
                            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ..........91 92 FIN 94 RA FIN 97 98 FIN RA
 */