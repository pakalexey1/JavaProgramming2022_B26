package practice_array_arraylist;

public class Triplets {
    public static void main(String[] args) {
        int[] noTriplets = {1, 1, 2, 2, 1};
        System.out.println(isNotTriplet(noTriplets));
    }

    public static boolean isNotTriplet(int[] arr) {

        for (int i = 0; i < arr.length-2; i++) {

            if (arr[i] == arr[i+1] && arr[i] == arr[i+2]){
                return false;
            }

        }
        return true;
    }
}

  /*
    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
        noTriples([1, 1, 2, 2, 1]) → true
        noTriples([1, 1, 2, 2, 2, 1]) → false
        noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     */