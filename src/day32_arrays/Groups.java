package day32_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String[][] cydeo = new String[4][];
        // String[][] cydeo = new String[4][3]; // first number represents describes the number of elements in MD arrays, and the second number represents the number of elements in the inner array
        System.out.println(Arrays.deepToString(cydeo));

        String[] groupOne = {"Emre", "Yasir", "Eda"}; // the other 3 inner arrays are empty/null
        cydeo[0] = groupOne;
        System.out.println(Arrays.deepToString(cydeo));

        String[] groupTwo = {"Basri", "Demet", "Shina", "Ismayil"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        cydeo[2]  = new String [] {"Mustafa","lima"}; // creating an array with new keyword
        System.out.println(Arrays.deepToString(cydeo));

        cydeo[3] = cydeo[2];
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("==========================");
        for(String [] innterArray: cydeo){ // loops through the 2d array, cydeo
            for (String eachWord: innterArray){ // loops through every String element in each 1d
                System.out.println(eachWord);
            }
        }

    }
}
