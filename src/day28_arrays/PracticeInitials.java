package day28_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PracticeInitials {
    public static void main(String[] args) {
        String[] str = {"James Bond", "Eve Rell", "Anna Johnson"};
        String[] output = new String[3];

        for (int i = 0; i < 3; i++) {
            output[i] = (str[i].substring(0, 1) + str[i].substring(str[i].indexOf(" ") + 1, str[i].indexOf(" ") + 2));
            System.out.println(output[i]);
        }

        //another practice attempt

        String [] str2 = {"James Bond", "Eve Rell", "Anna Johnson"};
        
        String [] output2 = new String [str2.length];

        for (int i = 0; i < str2.length; i++) {
            output2 [i] = str2[i].substring(0,1) + str2[i].substring(str2[i].indexOf(" ")+1,str2[i].indexOf(" ")+2);
        }
        System.out.println(Arrays.toString(output2));

    }
}

/*
Initials
• Given an array of classmate’s names, first name and last separated by a
space, print the initials of everyone
Ex:
Input:
[ “James Bond”, “Eve Rell”, “Anna Johnson” ]
Output:
JB
ER
AJ
 */