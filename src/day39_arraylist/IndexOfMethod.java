package day39_arraylist;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(100);
        nums.add(500);
        nums.add(800);
        nums.add(100);
        System.out.println(nums.indexOf(100)); // index of the first 100
        System.out.println(nums.indexOf(700)); // index -1

        int i = nums.indexOf(200);
        System.out.println(i); // index of 200 is 1

        System.out.println(nums.lastIndexOf(100)); //index of the last 100

        nums.set(nums.indexOf(100),0); // nums.(0,0) is the same
        System.out.println(nums.indexOf(100));

    }
}
