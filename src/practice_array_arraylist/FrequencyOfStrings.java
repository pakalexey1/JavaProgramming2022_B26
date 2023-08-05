package practice_array_arraylist;

public class FrequencyOfStrings {
    public static void main(String[] args) {
        String[] testArray = {"Apple", "Banana", "Apple", "Cherry", "Cherry", "Cherry"};
        frequencyOfStrings(testArray);
    }

    public static void frequencyOfStrings(String[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (!result.contains(arr[i])) {
                result += arr[i] + " = " + count + "\n";
            }

        }

        System.out.println(result);
    }
}
    /*
        Given the array return the output
                    String[] testArray = {"Apple","Banana","Apple","Cherry"};
                    Output Example
                    Apple = 2
                    Banana = 1
                    Cherry = 1
         */
