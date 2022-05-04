package day15_switch;

import java.util.Scanner;
public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your browser");
        String browser = input.nextLine();
        System.out.println("Enter the url");
        String url = input.nextLine();

       switch (browser) {
            case "chrome":
            case "Chrome":
                System.out.println("Opening " + url + " in Chrome browser");
                System.out.println("Loading...");
                break;

            case "Safari":
                System.out.println("Opening " + url + " in Safari browser");
                System.out.println("Loading...");
                break;

            case "Firefox":
                System.out.println("Opening " + url + " in Firefox browser");
                System.out.println("Loading... ");
                break;

            default:
                System.out.println(browser + " is not a valid browser");
        }

    }
}
