package tasks_from_festina.group15task_20220606;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(14));
    }
    public static boolean isPrime(int num){
        int count=0;
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                count++;
            }
        }

        return (count>0);
    }
}
/*
Write a method that can check if a number is prime or not
 */