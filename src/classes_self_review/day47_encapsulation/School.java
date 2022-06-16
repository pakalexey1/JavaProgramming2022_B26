package classes_self_review.day47_encapsulation;

import classes_self_review.day46_static.CydeoStudent;

public class School {
    public static void main(String[] args) {
        CydeoStudent emre = new CydeoStudent("Emre",5);
        System.out.println(emre);
        System.out.println("=================");

        CydeoStudent.printInfo();
        emre.printInfo();
        System.out.println("=================");
        System.out.println(CydeoStudent.instructors[0]);
    }
}
