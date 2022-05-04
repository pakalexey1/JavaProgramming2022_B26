package day21_loops;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {

        int num = 1;
        String result = "";
        while (num <=50) {
            num++;
            if (num%3 == 0 && num%5==0) {
                System.out.println("FizzBuzz");
            }
            else if (num%5 == 0) {
                System.out.println("Buzz");
            }
            else if (num%3 == 0) {
                System.out.println("Fizz");
            }else{
                System.out.println(num);
            }
        }

    }
}
