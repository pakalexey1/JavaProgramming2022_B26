package day28_arrays;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month number");
        int monthNum = input.nextInt();

        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(months[monthNum - 1]); // minus one is to address the issue, that array count starts with 0, and months numbers start with 1
    }
}


/*

Ask the user to the month number they want, print the month

 */