package day57_exceptions.learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a number");
            int num = input.nextInt();
            System.out.println(num);

            System.out.println("Enter number 2");
            int num2 = input.nextInt();

            System.out.println(num/num2);

        } catch (InputMismatchException e) {
            e.printStackTrace();// shows the exception message in the console
            //System.out.println("Wrong type of variable entered");
        }catch (ArithmeticException obj){
            System.err.println(obj.getMessage());
        }finally{
            System.out.println("FINALLY BLOCK");
            input.close();
        }
        System.out.println("Done");
    }
}
