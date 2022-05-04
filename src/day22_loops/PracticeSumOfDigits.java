package day22_loops;

public class PracticeSumOfDigits {
    public static void main(String[] args) {

        String str = "A1B2C3";
        int output = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='0' && str.charAt(i) <= '9' ){
                output= (output) + Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(output);
    }
}
