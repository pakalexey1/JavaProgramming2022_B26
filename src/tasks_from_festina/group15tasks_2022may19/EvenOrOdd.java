package tasks_from_festina.group15tasks_2022may19;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(-4));
    }

    public static String evenOrOdd(int a) {

        return (a % 2 == 0) ? "Even" : "Odd";

    }
}

/*
17) Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
 */
