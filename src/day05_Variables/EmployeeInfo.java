package day05_Variables;

import java.sql.PreparedStatement;

public class EmployeeInfo {
    public static void main(String[] args) {

        String fName, lName, gender, comName, job;
        int age, salary, pto;
        boolean FT, isMarried;

        fName="Hambone";
        lName="Fakenamington";
        gender = "male";
        comName = "Google";
        job = "SDET";

        age = 64;
        salary = 100000;
        pto = 25;

        FT = true;
        isMarried = true;

        char suite = 'A';

        String fullDetails = "Hi, my name is "+fName+" "+lName+" and I am a "+gender+". I am "+age+" years young. I work at "+comName+" and I am a "+FT+" full time employee. I am an "+ job+ " and I make " + salary + " a year. I have " +pto + " days per year of PTO. It is "+isMarried+ " that I am married and my suite is "+suite;

        System.out.println(fullDetails);

    }
}
