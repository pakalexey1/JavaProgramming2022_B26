package day16_review;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your mass in kg");
        double mass = input.nextDouble();
        System.out.println("Enter your height in meters");
        double height = input.nextDouble();
        double bmi = mass / (height * height);
        String bmiOut = "";
        boolean isValid = true;

        if (height>0) {
            if (mass > 0) {
                if (bmi >= 30) {
                    bmiOut = "Obese";
                } else if (bmi >= 25) {
                    bmiOut = "Overweight";
                } else if (bmi >= 18.5) {
                    bmiOut = "Normal Weight";
                } else {
                    bmiOut = "Underweight";
                }
            } else {
                System.out.println("Weight must be greater than zero");
                isValid = false;
            }
            if (isValid) {
                System.out.println("Your height is " + height + " meters and your weight is " + mass + " kg." +
                        "Your BMI is " + bmi + ", which means you are " + bmiOut);
            }
        }else {
            System.out.println("Height must be greater than zero");
        }
    }
}
