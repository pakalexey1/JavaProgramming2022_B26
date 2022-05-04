package day32_arrays;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {

        int [] intArr = {1,2,3  };

        int [] intArrLong = Arrays.copyOf(intArr,intArr.length+2);

        System.out.println(Arrays.toString(intArrLong));

    }
}
