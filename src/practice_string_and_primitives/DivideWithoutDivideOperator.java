package practice_string_and_primitives;

public class DivideWithoutDivideOperator {
    public static void main(String[] args) {
        int a = 11;
        int b = 2;
       divideWithoutDivideOperator(a,b);
    }
    public static void divideWithoutDivideOperator(int a, int b){
            int count = 0;
        while (a>b){
            a-=b;
            count++;
        }

        System.out.println("Answer: " + count + "\nRemainder: " + a);
    }
}
