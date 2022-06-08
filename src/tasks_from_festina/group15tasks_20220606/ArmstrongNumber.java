package tasks_from_festina.group15tasks_20220606;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println(isArmstrong(8208));

    }
    public static boolean isArmstrong(int num) {
        String numStr = num+"";
        String[] numArray = numStr.split("");
        int numSum=0;


        for (int i = 0; i <numArray.length; i++) {
//            Option 1 with loop
//            int forMultiplication = 1;
//            for (int j = 0; j < numArray.length; j++) {
//                forMultiplication*=Integer.parseInt(numArray[i]);
//            }
//            numSum += forMultiplication;

//            Option 2 with Math.pow
            numSum+= Math.pow(Double.parseDouble(numArray[i]), numArray.length);
        }

        return (num==numSum);

    }
}
//Write a method that can check if a number is Armstrong  number