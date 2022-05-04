package day10_scanner;

import java.util.Scanner;

public class Appartment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String address;// = "111 Street Ave, Los Angeles, CA 90021";
        String nameOwner;// = "Hambone Fakenamington";
        int numOfUnits;// = 20;
        double AvgSizeOfUnits;// = 1500;
        double monthlyRent;// = 2000;
        int numOfWashDry;// = 20;
        boolean allowPets;// = true;
        boolean hasPool;// = false;
        int leaseLength;// = 12;
        int numOfResidents;// = 45;
        String ownerPhone;// = 3105555555L;
        boolean nearGasStation;// = true;
        int numOfFloor;// = 4;
        boolean hasBasement;// = true;
        boolean hasUnitsAvail;// = false;
        boolean hasAC;// = true;
        int numOfParking;// = 40;
        boolean wheelchairAccess;// = true;
        double reviewStars;// = 4.9;
        boolean hasLived3Years;
        boolean hasLived6Years;

        System.out.println("PLease enter the address");
        address = input.nextLine();
        System.out.println("Please enter the name of the owner");
        nameOwner=input.nextLine();
        System.out.println("Pkease enter " + nameOwner + "'s phone number");
        ownerPhone=input.nextLine();
        System.out.println("Please enter the number of units");
        numOfUnits = input.nextInt();
        System.out.println("Please enter the number of washers and dryers");
        numOfWashDry = input.nextInt();
        System.out.println("Please enter teh length of lease");
        leaseLength = input.nextInt();
        System.out.println("Please enter the number of residents");
        numOfResidents = input.nextInt();
        System.out.println("Please enter the number of floors");
        numOfFloor = input.nextInt();
        System.out.println("Please enter the number of parking spaces");
        numOfParking = input.nextInt();
        System.out.println("Please enter the average size of the units");
        AvgSizeOfUnits = input.nextDouble();
        System.out.println("Please enter the monthly rent");
        monthlyRent = input.nextDouble();
        System.out.println("Have you lived there 0-5 years? True or False");
        hasLived3Years = input.nextBoolean();
        System.out.println("Have you lived there more than 6 years? True or False");
        hasLived6Years=input.nextBoolean();



        System.out.println("Monthly rent after 3 years is " + monthlyRent*.9);
        System.out.println("Monthly rent after 6 years is " + monthlyRent*.8);
        System.out.println("Average number of residents per unit " + ((double)numOfResidents / (double)numOfUnits));
        System.out.println("Average number of parking spots per unit " + (numOfParking/numOfUnits));
        System.out.println("Average number of units per floor " + (numOfUnits/numOfFloor));


    }
}
