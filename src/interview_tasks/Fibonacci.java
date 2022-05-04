package interview_tasks;

import java.util.ArrayList;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static ArrayList<Integer> fibonacci (int num){
        ArrayList <Integer> output = new ArrayList<>();
        if (num == 1){
            output.add(0);
        } else if (num == 2){
            output.add(0);
            output.add(1);
        } else {
            output.add(0);
            output.add(1);

            for (int i = 2; i < num; i++) {
                output.add(output.get(i-1)+output.get(i-2));
            }
        }
        return output;
    }
}

/*

17. The Fibonacci. It is a series of numbers where the next number is the sum of the previous two numbers. The first two numbers of the Fibonacci is 0 followed by 1. Write a method that will accept one int number n. The method will print n number of Fibonacci numbers.

// fib(3)  -> 0 1 1
  // fib(5)  -> 0 1 1 2 3
  // fib(6)  -> 0 1 1 2 3 5
  // fib(10) -> 0 1 1 2 3 5 8 13 21 34

 */
