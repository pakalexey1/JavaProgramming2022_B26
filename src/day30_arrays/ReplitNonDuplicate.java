package day30_arrays;

public class ReplitNonDuplicate {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 3, 4, 1};
      //  String output = "";
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if (count==1){
                System.out.println(nums[i]);
            }

        }

       /* for (int i = 0; i < nums.length; i++) {
            output+=nums[i];
        }
        System.out.println(output);

         for (int i = 0; i < output.length(); i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (output.charAt(i)==output.charAt(j)){
                    count++;
                }
            }
            if (count==1){
                System.out.print(output.charAt(i));
            }
        }
         */
    }
}

/*
Given an int [] nums that has duplicate numbers, which means each numbers is found twice in the array. Find and print the non-duplicate number, which mean the ones that does not have two occurrences of it
Main topics: arrays, primitive datatypes, index, operators, loops, if statements, counter

Example:

Input:
  [1, 2, 3, 4, 3, 4, 1]

Output:
  2
 */