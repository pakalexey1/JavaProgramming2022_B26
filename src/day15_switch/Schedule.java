package day15_switch;
import java.util.Scanner;
public class Schedule {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String dayName = input.nextLine();
        String className = "";
        String classTime = "";
        String instructorName = "";
        boolean officeHours = false;

        switch (dayName) {
            case "Monday":
            case "monday":
            case "mon":
                 className = "Java";
                 classTime = "19:00 - 22:00";
                 instructorName = "Saim";
                 officeHours = false;
                break;
            case "Tuesday":
            case "tuesday":
            case "tue":
            case "Wednesday":
            case "wednesday":
            case "wed":
                 className = "Java";
                 classTime = "19:00 - 22:00";
                 instructorName = "Saim";
                 officeHours = true;
                break;
            case "Thursday":
            case "thursday":
            case "thu":
                className = "Soft Skills";
                classTime = "19:00 - 22:00";
                instructorName = "Nadir";
                officeHours = false;
                break;
            case "Friday":
            case "friday":
            case "fri":
                className = "No Class Today";
                classTime = "All Day";
                instructorName = "N/A";
                officeHours = false;
                break;
            case "Saturday":
            case "saturday":
            case "sat":
            case "Sunday":
            case "sunday":
            case "sun":
                className = "Java";
                 classTime = "10:00 - 17:00";
                 instructorName = "";
                 officeHours = false;
                break;
            default :
                System.out.println("Wrong week day");
        }
        System.out.println("className = " + className);
        System.out.println("classTime = " + classTime);
        System.out.println("instructorName = " + instructorName);
        System.out.println("officeHours = " + officeHours);

    }
}
