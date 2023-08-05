package practice_string_and_primitives;

public class ConvertStringToInt {
    public static void main(String[] args) {
        String nums = "123";
        System.out.println(convertToInteger(nums));
    }

    public static int convertToInteger(String str) {

        int result = 0;
        int temp = 1;

        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                result += temp * (str.charAt(i) - 48);
                temp *= 10;
            }
        }
        return result;

    }
}
