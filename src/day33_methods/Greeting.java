package day33_methods;

import java.util.Scanner;

public class Greeting {
    public static void hello(String name) { // the 'name' variable is a parameter that is local to the 'hello' method only
        System.out.println("Hello " + name + ", how are you?");
    }

    public static void main(String[] args) {
        hello("James");
        hello("Jamie");

        Scanner input = new Scanner(System.in);
        System.out.println("Etner your name");
        String fname = input.nextLine(); // this 'name' variable is different from the one in the 'hello' method
        hello(fname);//refers to the scanner input
    }
}
