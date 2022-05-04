package day28_arrays;

public class AddElements {
    public static void main(String[] args) {

        int [] numbs = {3,6,10};
        int output=0;

        for (int i = 0; i < 3; i++) {
            output+=numbs[i];
        }
        System.out.println("Sum of numbers: " +numbs[0]+", " + numbs[1]+" and "+numbs[2]+" is "+(output));
    }
}


/*
declare and assign and array of numbers
    {3,6,10}
sum all the numbers in the array
 */