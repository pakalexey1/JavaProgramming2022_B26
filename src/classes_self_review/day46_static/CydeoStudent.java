package classes_self_review.day46_static;

import java.util.Arrays;

public class CydeoStudent {
    String name;
    int groupNumber;

    static int batchNumber;
    static String[] instructors;
    static String schoolName;

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
