package day11_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What's the temperature outside?");
        int temperature = input.nextInt();

        if(temperature>=70) {
            System.out.println("It's a nice day");
            System.out.println("Go outside but with your laptop");

        }else{
            System.out.println("It's too cold");
            System.out.println("Code more java");
        }

    }
}

/*
    Task
        ask user to enter the temperature



 */