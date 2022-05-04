package day16_review;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 = input.nextDouble();
        System.out.println("Enter the operator: + - * / %");
        String operator = input.next();
        System.out.println("Enter the second number");
        double num2 = input.nextDouble();
        double result = 0;
        boolean isValidOperator = true;


        switch (operator) {

            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                }else{
                    System.out.println("Cannot divide by 0");
                }
                break;
            case "%":
                if (num2==0){
                    System.out.println("Can't take remainder of division by 0");
                }else {
                    result = num1 % num2;
                }
                break;
            default:
                System.out.println("Invalid operator");
                isValidOperator=false;
        }
        if (isValidOperator){
            System.out.println(num1 + " " + operator + " "+ num2 + " = " + result);
        }
    }

}
    /*
    declare and assign 2 number variables
    declare and assign a char variable for an operator

    create a calculator based on the operator picked
        + : add num1 and num2
        - : minus num1 and num2
        * : multiply num1 and num2
        / : divide num1 and num2
        any other char: "invalid operator"
     */
