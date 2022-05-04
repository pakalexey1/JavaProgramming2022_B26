package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {

        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 12, 9, 143, 4));

        ArrayList<Integer> nums = new ArrayList<>(base);
        nums.removeIf(everyElement -> everyElement % 2 == 0);
        System.out.println(nums);

        ArrayList<Integer> nums2 = new ArrayList<>(base);
        nums2.removeIf(eachElement -> eachElement > 10);
        System.out.println(nums2);

       // ArrayList<String> days = ArrayListWithMethods.getDaysOfWeek();
        ArrayList<String> days = new ArrayList<>(ArrayListWithMethods.getDaysOfWeek());
        days.removeIf(eachDay -> eachDay.startsWith("S") || eachDay.startsWith ("T"));
        System.out.println(days);
    }
}
