package practice2023.calculator;

public class SimpleCalculator {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 13;

        Calculator addition = new Addition(num1, num2);
        addition.calculate();

        Calculator subtraction = new Subtraction(num1, num2);
        addition.calculate();
    }
}
