package interview_tasks;

public class AnotherFizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(1, 100);
    }

    public static void fizzBuzz(int startNum, int endNum) {

        for (int i = startNum; i <= endNum; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }

    }
}


/*
14. FizzBuzz. Print numbers from 1 to 100
- if a number is divisible by 3 print Fizz
- if a number is divisible by 5 print Buzz
- if a number is divisible by both 3 and 5 print FizzBuzz

 */