package day16_review;

import java.util.Scanner;

public class CarpetShop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Which room do you need carpet at?\n" +
                "\n\t1) - Bedroom" +
                "\n\t2) - Kitchen");
        int room = input.nextInt();
        boolean isValid = true;
        double area=1;
        double unitPirceForCarpet = 3.92;

        if (room == 1 || room == 2){
            if (room==1){
                System.out.println("What is the width of the bedroom in meters?");
                double width = input.nextDouble();
                System.out.println("What id the length of the bedroom in meters?");
                double length = input.nextDouble();
                area = width*length;
            }else {
                System.out.println("What is the diameter of the kitchen in meters?");
                double diameter = input.nextDouble();
                area = 3.14*diameter*diameter;
            }

        }else{
            System.out.println("Invalid room selection");
            isValid = false;
        }
        if (isValid){
            System.out.println("Enter your address");
            input.nextLine();
            String address = input.nextLine();
            System.out.println("The cost of your carpet is: "+area*unitPirceForCarpet + " and it will be delivered to "+ address+ " in one week.");
        }

    }
}

/*
                     Task : CarpetShop

                            - Ask the user which room do they need carpet? (String)
                            			List of Rooms
                            				Bedroom
                            				Kitchen

                            -> If the user gives other than these roomTypes ,  give an error message about "Invalid Room Type"

                            		- Ask the user roomType dimensions (as meter and double)
                            			Kitchen is circle.Take radius from user
                            			Bedroom is square or Rectangle.Take lenght and width from user

                            			- Ask the user to delivery address (String, multiple words)
                            			- unitPriceForCarpet = 3.92
                            			- totalcost = area*unitPriceForCarpet;

                            - Print in the following format:
                            		Ex:
                            			inputs: Bedroom,length 4,width 3,1300 Lamar St Houston TX 77010

                            			"TotalCost for your carpet is 51.84 and it will be delivery 1300 Lamar St Houston TX 77010 in one week"
 */