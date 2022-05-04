package day37_wrapper_arraylist;

public class CountCharacters {
    public static void main(String[] args) {

        String str = "aA3d572&*jd@jd";
        int countUpper = 0;
        String upper = "";
        int countLower = 0;
        String lower = "";
        int counterNums = 0;
        String nums = "";
        int countOther = 0;
        String other = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                countUpper++;
                upper+=str.charAt(i);
            } else if (Character.isLowerCase(str.charAt(i))) {
                countLower++;
                lower+=str.charAt(i);
            } else if (Character.isDigit(str.charAt(i))) {
                counterNums++;
                nums+=str.charAt(i);
            } else {
                countOther++;
                other+=str.charAt(i);
            }
        }
        System.out.println("countUpper = " + countUpper + ": " + upper);
        System.out.println("countLower = " + countLower + ": " + lower);
        System.out.println("counterNums = " + counterNums + ": " + nums);
        System.out.println("countOther = " + countOther + ": " + other);
    }

}
/*
given some string, count the number of uppercase letters, lowercase letters, numbers and other characters

aA3d572&*jd@jd
 */