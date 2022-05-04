package day16_review;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Is your browser open?");
        boolean isBrowserOpen = input.nextBoolean();

        System.out.println("What's your browser name ");
        input.nextLine();
        String browserName = input.nextLine();

        System.out.println("What's your operating system?");
        String operatingSystem = input.nextLine();

        if (operatingSystem.equals("windows")||operatingSystem.equals("mac")) {
            if (browserName.equals("chrome")||operatingSystem.equals("chrome-headless")||browserName.equals("firefox")||browserName.equals("firefox-headless")||browserName.equals("ie")||browserName.equals("edge")||browserName.equals("safari")||browserName.equals("remote-chrome")) {
                if (!isBrowserOpen) {
                    if ((browserName.equals("ie") && operatingSystem.equals("mac")) || (browserName.equals("edge") && operatingSystem.equals("mac")) || (browserName.equals("safari") && operatingSystem.equals("windows"))) {
                        System.out.println("Your " + operatingSystem + " doesn't support " + browserName);
                    } else {
                        System.out.println("Browser is opened successfully with " + browserName + " in " + operatingSystem);
                    }

                } else {
                    System.out.println("Browser is already opened with " + browserName + " in " + operatingSystem);
                }
            } else {
                System.out.println("Invalid browser name");
            }
        }else{
            System.out.println("Invalid operating system name");
        }



    }
}
