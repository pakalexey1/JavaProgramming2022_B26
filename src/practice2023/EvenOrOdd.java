package practice2023;

public class EvenOrOdd {
    public static void main(String[] args) {

        System.out.println(isEvenOrOdd(5));
    }

    public static String isEvenOrOdd(int num){

        if (num%2==0){
            return "even";
        }else return "odd";


    }

}


/*
1) Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
 */