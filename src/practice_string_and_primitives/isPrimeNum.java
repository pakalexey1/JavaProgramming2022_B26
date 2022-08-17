package practice_string_and_primitives;

public class isPrimeNum {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(isPrimeNum(a));
    }

    public static boolean isPrimeNum(int a) {
        int count = 0;
        if (a == 2) {
            return true;
        } else {
            if (a % 2 == 0) {
                count++;
            }
        }
        return (count < 1);
    }
}

//22
//Numbers -- Prime Number. Prime num is a number that divided by itself and 1
//        Write a method that can check if a number is prime or not
