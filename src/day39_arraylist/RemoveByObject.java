package day39_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        nums.add(500);

        nums.remove(0);
        System.out.println(nums);

        Integer i = 500;
        //nums.remove(500); would consider 500 an index, not the actual number that needs to be removed. So it would yield an out of bounds error.

        nums.remove(i);
        System.out.println(nums);

        System.out.println(Integer.valueOf(200));//
        //nums.remove(Integer.valueOf(200)); // valueOf returns wrapper object types
        System.out.println(nums);

        nums.remove((Integer) 800);
        System.out.println(nums);

    }

}
