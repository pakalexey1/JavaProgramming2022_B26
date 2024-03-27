package practice2023.calculator;

public class Subtraction extends Calculator{
    public Subtraction(double num1, double num2){
        super(num1, num2);
    }

    @Override
    public void calculate(){
        System.out.println("Subtracting: " + (num1-num2));
    }

}
