package day24_loops;

public class PrimeNumber {
    public static void main(String[] args) {

        int number = 12;
        int count = 0;
        boolean isPrime = true;

        for (int i = 2; i < number ; i++) {
            if (number%i!=0) {

            } else {
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println(number+" is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }

    }
}
