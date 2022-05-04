package day50_inheritance;

import org.w3c.dom.ls.LSOutput;

public class UsingBookClass extends Book {
    public static void main(String[] args) {


        Book obj4 = new Book();
        obj4.author = new Author("JK Rawling", 40);// made an Author object it belongs to the Book obj4 object
        System.out.println(obj4.author);
        System.out.println(obj4.author.getName());

    }
}
