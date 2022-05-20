package tasks_from_festina.group15tasks;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(3));
    }
    public static String evenOrOdd(int num){
        if (num%2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }
}

/*
1) Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
 */

