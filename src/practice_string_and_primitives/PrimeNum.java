package practice_string_and_primitives;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }
    public static boolean isPrime(int a){
        int count = 0;
        for (int i = 2; i < a; i++) {
            if (a%i==0){
                count++;
            }
        }
        return (count==0);
    }
}

////22
//Numbers -- Prime Number. Prime num is a number that divided by itself and 1
//        Write a method that can check if a number is prime or not
