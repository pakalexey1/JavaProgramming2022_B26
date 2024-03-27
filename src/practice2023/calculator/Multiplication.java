package practice2023.calculator;

public class Multiplication extends Calculator{
    public Multiplication(double num1, double num2){
        super(num1, num2);
    }

    @Override
    public void calculate(){
        System.out.println("Multiplication: " + (num1*num2));
    }
}
