package day28_arrays;

public class MaxMin {
    public static void main(String[] args) {

        int [] nums = {500,120,-80,90,250,-10};
        int output = 0;
        int outputSmall = 0;

        for (int i = 0; i < 6; i++) {
            if (nums[i]>output){
             output=nums[i];
            }
            if (nums[i]<outputSmall){
                outputSmall=nums[i];
            }
        }
        System.out.println(output);
        System.out.println(outputSmall);

    }
}
