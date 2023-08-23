package aJavaDevCourse.week02_lambda.review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student( 101, "Mike"));
        studentList.add(new Student( 102, "Joe"));
        studentList.add(new Student( 103, "Max"));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher( "John", 201));
        teacherList.add(new Teacher( "Sara", 202));
        teacherList.add(new Teacher( "Terry", 203));

//        printAndCount(studentList);

        printInfo3(studentList);
    }

    //write a method that takes a list of students and prints each student object and the total count of students

    public static void printAndCount (List<Student> studentList){
        for (Student student : studentList){
            System.out.println(student);
        }
        System.out.println("The total number of students = " + studentList.size());
    }

    public static <T> void printInfo3 (List<T> personList){
        for (T person : personList){
            System.out.println(person);
        }
        System.out.println(personList.size());
    }

    //method that will take a list of objects and returns the last element in the list
    public static <T> T lastElement (List<T> personList){
        return  personList.get(personList.size()-1);
    }
}
