package day06_RecapOfDay05;

import java.sql.SQLOutput;

public class Pizza {
    public static void main(String[] args) {

        String type = "cheese";
        int slices = 20;
        int people = 7;
        int slicesPerPerson = slices / people;
        int slicesLeft = slices % people;

        System.out.println("We ordered " + type + " pizza with " + slices + " slices, " + people + " people ate " + slicesPerPerson + " slices each with " + slicesLeft + " left over");

    }
}
/*
create a class Pizza
add a main method
declare and assign these variables:

   type of pizza,  the number of slices,  the number of people eating

calculate how many slices each person will get
calculate how many slices are left over

Sample print statement:

   We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
 */