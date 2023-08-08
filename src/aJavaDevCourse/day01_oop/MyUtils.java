package aJavaDevCourse.day01_oop;

import aJavaDevCourse.day02_lambda.review.Student;

import java.util.ArrayList;
import java.util.List;

public class MyUtils <T>{
    public void printInfo3(List<T> personList){
        for (T person: personList){
            System.out.println(person);
        }

        System.out.println(personList.size());
    }

    public T returnLastElement (List<T> personList){
        return personList.get(personList.size()-1);
    }

    public static void main(String[] args) {
        MyUtils<Student> myUtils = new MyUtils<>();

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student( 101, "Mike"));
        studentList.add(new Student( 102, "Joe"));
        studentList.add(new Student( 103, "Max"));

        myUtils.printInfo3(studentList);
    }
}
