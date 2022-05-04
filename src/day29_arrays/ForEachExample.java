package day29_arrays;

public class ForEachExample {
    public static void main(String[] args) {

        int[] nums = {30, 12, 159, 12};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("tradtiaional " + nums[i]);
        }
        System.out.println("=================");

        // for each loop example
        for (int element : nums) { // for each loop. the name "element" is given here.
            System.out.println("for each: " + element);
        }

        System.out.println("=======String Example===========");
        // String example
        String[] classes = {"java", "soft skills", "selenium", "database", "api"};

        // traditional
        for (int i = 0; i < classes.length; i++) {
            System.out.println("traditional: " + classes[i]);
        }

        System.out.println();
        //for each
        for (String word : classes) {
            System.out.println("for each: " + word);
        }

        // double example
        System.out.println("=======Double Array Example========");

        double[] prices = {10.4, 40.2, 402.5};
        for (double doubleArray : prices) {
            System.out.println("for each Double: " + doubleArray);
        }


    }
}
