package tasks_from_festina.group15_task;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        System.out.println(divideWithoutOperator(40,2));
    }
    public static int divideWithoutOperator(int a, int b) {

        int count = 0;
        if (a > b) {
            while (a - b >= 0) {
                a -= b;
                count++;
            }
        }

        return count;
    }
}

/*
18) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator
 */