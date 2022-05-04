package day04_variables;

public class VaribalesStudents {
    public static void main(String[] args) {

        int grade1=10;
        int grade2=12;
        int grade3=14;
        int grade4=15;
        int grade5=16;

        int total = grade1+grade2+grade3+grade4+grade5;

        double daysInYear=100.5;
        int snow = 5;
        double gpa = 3.56;

        System.out.println("Number of students in grade 1: "+grade1);
        System.out.println("Number of students in grade 2: "+grade2);
        System.out.println("Number of students in grade 3: "+grade3);
        System.out.println("Number of students in grade 4: "+grade4);
        System.out.println("Number of students in grade 5: "+grade5);
        System.out.println("Total number of students is: "+total);
        System.out.println("___________________________________");
        System.out.println("There are "+daysInYear+" school days in a year");
        System.out.println("There are "+snow+" snow days in a year");
        System.out.println("The average GP in school is "+gpa);


    }
}
