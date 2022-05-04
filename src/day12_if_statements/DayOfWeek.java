package day12_if_statements;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = inp.nextInt();

        if (num == 1){
            System.out.println(num+" - Monday");
        }else if(num==2){
            System.out.println(num+" - Tuesday");
        }else if (num == 3) {
            System.out.println(num+" - Wednesday");
        } else if (num == 4) {
            System.out.println(num+" - Thursday");
        } else if (num == 5) {
            System.out.println(num+" - Friday");
        } else if (num == 6) {
            System.out.println(num+" - Saturday");
        } else if (num == 7) {
            System.out.println(num+" - Sunday");
        }else {
            System.out.println("Invalid number");
        }
    }
}
