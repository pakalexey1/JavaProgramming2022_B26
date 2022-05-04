package interview_tasks;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        System.out.println(noDuplicates("hello"));
    }

    public static String noDuplicates (String str){

        String noDuplicates = "";

        for (int i = 0; i < str.length(); i++) {
            if (!noDuplicates.contains(str.charAt(i)+"")){
                noDuplicates+=str.charAt(i);
            }
        }

        return noDuplicates;
    }

}

/*
12. Remove duplicates from a string.
Write a method that accepts one string argument and returns it without duplicates. We will see two versions of this method.
 */