package day32_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a; // b is a new reference/na,e but the array is the same as the one 'a' reference/name is pointing to, so there is only one array made

        System.out.println("a: " + Arrays.toString(a)); //prints [1,2,3]
        System.out.println("b: " + Arrays.toString(b)); //prints [1,2,3]

        a[0] = 100;
        b[1] = 200;
        System.out.println("After changing a[0] and b[1]");
        System.out.println("a: " + Arrays.toString(a));//prints [100,2,3]
        System.out.println("b: " + Arrays.toString(b));//prints [100,2,3]

        int [] z = Arrays.copyOf(a,a.length);
        System.out.println("z: " + Arrays.toString(z)); //prints [100,200,3]
        z[0] = 500;
        System.out.println("After changing z[0]");
        System.out.println("z: " + Arrays.toString(z));//prints [500,200,3]
        System.out.println("a: " + Arrays.toString(a));//prints [100,200,3]
        System.out.println("b: " + Arrays.toString(b));//prints [100,200,3]


    }
}
