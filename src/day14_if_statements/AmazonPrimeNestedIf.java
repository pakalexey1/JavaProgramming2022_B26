package day14_if_statements;

public class AmazonPrimeNestedIf {
    public static void main(String[] args) {

        /*

        Task:
            declare and assign a price variable
            declare and assign a boolean - hasPrime

            possible outputs:

                prime member:
                    "Eligible for 2-day shipping"

                not prime and item price is mor than equal 25:
                    "Eligible for regular free shipping"

                not prime and item price is less than 25:
                    "Not eligible for free shipping. Shipping fee is 3.99"

         */

        double price = 12.55;
        boolean hasPrime = false;

        if (hasPrime) {
            System.out.println("Eligible for free shipping");
        } else {
            if (price >= 25) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee is 3.99");
            }
        }

    }
}
