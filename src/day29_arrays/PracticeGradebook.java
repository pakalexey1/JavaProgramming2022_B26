package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeGradebook {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numberOfStudents = input.nextInt();
        input.nextLine();

        String[] students = new String[numberOfStudents];
        int[] score = new int[numberOfStudents];

        System.out.println("Enter the student names");
        for (int i = 0; i < numberOfStudents; i++) {
            students[i]=input.nextLine();
        }

        System.out.println("Enter score for each student");
        for (int i = 0; i < numberOfStudents; i++) {
            score[i]=input.nextInt();
        }

        char [] grade = new char [numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            if (score[i] >= 0 && score[i] <= 100) {
                if (score[i] >= 85) {
                    grade[i] = 'A';
                } else if (score[i] >= 75) {
                    grade[i] = 'B';
                } else if (score[i] >= 65) {
                    grade[i] = 'C';
                } else {
                    grade[i] = 'D';
                }
            }else{
                System.out.println("Score must be between 0 and 100");
            }
        }
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i] +" | " + score[i] + " | "+ grade [i]);
        }
        }

    }

/*
Declare three arrays:
1. String array which will hold names for the students (give values)
2. Int array which has the score of the student got in the quiz (give values)
3. Char array which will have some letter grade based on the score (empty)
4. Output the gradebook at the end with all the information
Grade scale:
Above 85: A
Above 75: B
Above 65: C
Other: D
Challenge: Accept all the
information with Scanner

    String[] students = {"Mike Spike", "John Smith", "Vlad Gad", "Hambone Fakenamington"};
    int [] score = {50, 75, 68, 99};
    char [] grade = new char[score.length];

 */