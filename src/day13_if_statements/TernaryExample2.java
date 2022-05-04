package day13_if_statements;

public class TernaryExample2 {
    public static void main(String[] args) {

        String posOrNeg;
        int num = 1;

        posOrNeg = num>0? "Positive" : num < 0 ? "Negative" : "Zero";

        System.out.println(posOrNeg);

        System.out.println("=============================");

        int time = 12;

        double price;

        if (time >= 10 && time <= 15) {
            price = 7.99;
        } else {
            price = 10.99;
        }

       double ternaryPrice = time >= 10 && time <=15 ? 7.99 : 10.99;

        System.out.println((true)? "hello" : "Bye");

    }
}
