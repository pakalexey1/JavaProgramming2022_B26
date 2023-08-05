package practice_string_and_primitives;

public class SumOnlyDigitsFromString {
    public static void main(String[] args) {
        String dev = "I5 a3m an Soft9ware 2 Develop3er";
        System.out.println(sumOnlyDigits(dev));
    }

    public static String sumOnlyDigits (String str){

        int numOutput = 0;
        String stringOutput = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                numOutput += str.charAt(i) -48;
                stringOutput += ""+str.charAt(i) + " + ";
            }
        }

        stringOutput = stringOutput.substring(0,stringOutput.length()-2);

        return stringOutput + "= " + numOutput;
    }
}

/*
Write a method that will accept a String and return sum of numbers in a string.
          Input: "I5 a3m an Soft9ware 2 Develop3er" output: 5 + 3 + 9 + 2 + 3 = 22
 */
