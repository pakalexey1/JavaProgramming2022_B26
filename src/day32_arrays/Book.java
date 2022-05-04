package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many chapters does the book have?");
        String [][]books = new String[input.nextInt()][];
        System.out.println(Arrays.deepToString(books));
        input.nextLine();

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter chapter " + (i+1));
            String chapter = input.nextLine();;
            String [] sentences = chapter.split(". "); //
            books[i] = sentences;
        }
        System.out.println(Arrays.deepToString(books));
    }
}


/*
    Flow:
        How many chapters is there
        make a book that many chapter
        write th chapters one at a time
            break up each chapter by sentences
 */
