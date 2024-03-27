package practice2023.calculator;

public class Division extends Calculator{
    public Division(double num1, double num2){
        super(num1, num2);
    }

    @Override
    public void calculate(){
        System.out.println("Division: " + (num1*num2));
    }
}
