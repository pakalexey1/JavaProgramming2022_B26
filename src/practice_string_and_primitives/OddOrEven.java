package practice_string_and_primitives;

public class OddOrEven {

    public static void main(String[] args) {
        System.out.println(oddOrEven(0));
    }

    public static String oddOrEven(int a) {
        return (a % 2 == 0 ? "Even" : "Odd");
    }
}
/*
14 Use String
int a=5;

if number is odd output will be "odd", if number is even output will be "even"
 */