package practice_string_and_primitives;

public class ReturnOnlyDuplicatedChars {
    public static void main(String[] args) {
        String str = "inteerrrviiew";
        System.out.println(returnOnlyDuplicatedChars(str));
    }

    public static String returnOnlyDuplicatedChars(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            String each = (str.charAt(i) + "");
            for (int j = i; j < str.length(); j++) {
                if (each.equals(str.charAt(j) + "")) {
                    count++;
                }
            }
            if (count > 1 && !res.contains(each)) {
                res += each;
            }
        }
        return res;
    }
}
    /*
               input: inteerrrviiew
               output:  ier
        create method return duplicated unique value
     */