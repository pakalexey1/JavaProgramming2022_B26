package practice_string_and_primitives;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutationsString {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(permutations(str));

    }

    public static String permutations(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String res = "";
        int numOfComb = 1;
        for (int i = 1; i <= str.length(); i++) {
            numOfComb *= i;
        }

        for (int i = 0; i < numOfComb; ) {
            Collections.shuffle(list);
            if (!res.contains(String.valueOf(list))) {

                res += list;
                i++;
            }
        }

        return res;
    }
}
//print all the combinations of a string,
// e.g. all the possible combinations of "ABC": "ACB", "BAC", "BCA", "CAB", "CBA"
