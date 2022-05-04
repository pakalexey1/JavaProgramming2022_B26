package day11_if_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Are you hungry?");

        boolean isHungry= input.nextBoolean();

        if (isHungry) {
            System.out.println("You are hungry, so I will get something for you");
        }else {
            System.out.println("Great, then practice java");
        }
    }
}

/*
task:
    boolean variable isHungry

    if the person is hungry then print "You are hungry so I will get something for you"
    if the person is not hungry then print "Great, then practice java"
 */
