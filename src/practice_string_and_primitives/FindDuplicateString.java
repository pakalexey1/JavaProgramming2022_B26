package practice_string_and_primitives;

public class FindDuplicateString {
    public static void main(String[] args) {
        System.out.println(findDuplicateString("java i love java reading books about java i"));
    }

    public static String findDuplicateString (String a){
        if (a.length()>2 && a.trim().contains(" ")) { // make sure not an empty string && it has at least two words
            String[] arrayA = a.split(" ");
            String result = "";
            int count = 0;
            for (int i = 0; i < arrayA.length; i++) {
                for (int j = i; j < arrayA.length; j++) {
                    if (arrayA[i].equals(arrayA[j])) {
                        count++;
                    }
                }
                if (count > 1 && !result.contains(arrayA[i])) {
                    result += arrayA[i] + ", ";
                }
                count = 0;
            }

            return result.substring(0, result.length() - 2);
        }
        return "String must be at least 2 characters long and contain at least two words";
    }
}


/*
find duplicate words in a String and print them but not more than once.
A string must be at least two words long
 */