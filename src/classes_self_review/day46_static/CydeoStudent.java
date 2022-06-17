package classes_self_review.day46_static;

import classes_self_review.day42_custom_classes.Coffee;

import java.util.Arrays;

public class CydeoStudent {
    public String name;
    public int groupNumber;

    Coffee myCoffee;

    public static int batchNumber;
    public static String[] instructors;
    public static String schoolName;

    static {
        batchNumber = 26;
        instructors = new String[] {"Saim","Nadir","Aysun","Mehmet"};
        schoolName = "Cydeo";
    }

    public CydeoStudent (String name, int groupNumber){
        this.name = name;
        this.groupNumber = groupNumber;
        printInfo();
    }

    public static void  printInfo(){
        System.out.println("School name " + schoolName);
        System.out.println("Batch number " + batchNumber);
        System.out.println("Instructors " + Arrays.toString(instructors));
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
