package day06_RecapOfDay05;

public class CastingPractice {
    public static void main(String[] args) {

        short short1 = 20;
        byte byte1 = (byte) short1;

        System.out.println(byte1);

        float float1 = 12.3F;
        double double1=float1;

        double double2 = 23.4;
        int int1= (int) double2;

        long long1=1230;
        int int2=(int)long1;


    }
}

/*
declare and assign a short variable
declare and assign a byte variable with the short value above. Cast if needed

declare and assign a float variable
declare and assign a double variable with the float value above. Cast if needed

declare and assign a double variable
declare and assign a int variable with the double value above. Cast if needed

declare and assign a long variable
declare and assign a int variable with the long value above. Cast if needed
 */