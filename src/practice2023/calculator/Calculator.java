package practice2023.calculator;

public abstract class Calculator {
    protected double num1;
    protected double num2;

    public Calculator(double num1, double num2){
        this.num1=num1;
        this.num2=num2;
    }

    public void calcualte(){

    }

    public abstract void calculate();
}
