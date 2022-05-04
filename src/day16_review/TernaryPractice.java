package day16_review;
import java.util.Scanner;
public class TernaryPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter an animal name");
        String animal = "dog";
        String animalType;
        animalType = (animal == "dog" || animal == "cat") ? "domestic" : (animal == "tiger") ? "wild" : "unknown";
        System.out.println(animalType);
    }
}
