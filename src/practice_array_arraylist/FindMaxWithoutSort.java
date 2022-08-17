package practice_array_arraylist;

public class FindMaxWithoutSort {
    public static void main(String[] args) {
        String[] arr = {"1", "2.5", "5.5", "3", "3.5", "4.5"};
        System.out.println(maxElement(arr));
    }
    public static String maxElement(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String temp = "";
            for (int j = i; j < arr.length; j++) {
                if (Double.parseDouble(arr[i]) < Double.parseDouble(arr[j])) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[0];
    }
}


//34  USE double
//        Dont use sort get max  4.5
//        String[] arr = {"1","2.5", "3", "3.5", "4.5"};
//
//        output
//        4.5