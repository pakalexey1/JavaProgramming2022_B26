package day13_if_statements;

public class Driver {
    public static void main(String[] args) {
        int oxy = 100;

        if (oxy > 90 ) {
            System.out.println("Your tank is full");
        } else if (oxy > 80 && oxy <=90) {
            System.out.println("Still okay");
        } else if (oxy >70 && oxy <= 80) {
            System.out.println("Don't go too far");
        } else if (oxy > 60 && oxy <= 70) {
            System.out.println("Start heading back");
        } else if (oxy >50 && oxy <= 60) {
            System.out.println("Be careful now you are at 50%");
        }else {
            System.out.println("You have 2 minute to live");
        }
    }
}
