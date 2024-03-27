package practice2023.calculator;

public class Addition extends Calculator{
    public Addition(double num1, double num2){
        super(num1, num2);
    }

    @Override
    public void calculate(){
        System.out.println("Addition: " + (num1+num2));
    }
}
