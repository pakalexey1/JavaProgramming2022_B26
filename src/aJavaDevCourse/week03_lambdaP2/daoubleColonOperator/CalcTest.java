package aJavaDevCourse.week03_lambdaP2.daoubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class CalcTest {
    public static void main(String[] args) {

        //Reference a static method
        Calculate s1 = (x,y) -> Calculator.findSum(x,y);
        s1.calculate(10,20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(100,35);

        //Reference an instance method
        Calculate m1 = (x,y) -> new Calculator().findMultiply(x,y);
        m1.calculate(5,6);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiply;
        m2.calculate(6,6);

        Calculate m3 = new Calculator()::findMultiply;
        m3.calculate(6,6);

        BiFunction<String,Integer,String> fn = (str,i) -> str.substring(i);
        System.out.println(fn.apply("Developer",6));

        BiFunction<String,Integer,String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer",6));

        Consumer<Integer> display = i-> System.out.println(i);
        display.accept(20);

        Consumer<Integer> displaye2 = System.out::println; // first class (System.out), then ::, then method (println)
        displaye2.accept(20);

    }
}
