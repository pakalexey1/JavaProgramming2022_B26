package classes_self_review.day56_polymorphism;

import classes_self_review.day50_inheritance.book.Ebook;

public class Library {
    public static void main(String[] args) {

        JavaTextbook book1 = new JavaTextbook();
        book1.name = "Java Programming";
        book1.size = 20.5;
        book1.fun = true;
        book1.download();
        book1.open();
        book1.read();

        EBook book2 = new JavaTextbook();
        book2.name = "Some Ebook";
        book2.size = 10.2;
        ((JavaTextbook)book2).fun = true; //Ebook reference doesn't have access to the "fun" variable, but downcasting allowed book2 to "see" the "fun" variable.
        book2.download();
        book2.open();
        book2.read();

        Book book3 = new JavaTextbook();
        book3.name = "Some Ebook";
//        book3.size = 10.2;
//        book3.fun = true; Ebook reference doesn't have access to the "fun" variable
//        book3.download();
//        book3.open();
        book3.read();

        Downloadable book4 = new JavaTextbook();
//        book4.name = "Java Programming"; The only thing that is accessible by Downloadable is download()
//        book4.size = 20.5;
//        book4.fun = true;
        book4.download();
//        book4.open();
//        book4.read();

        JavaTextbook book5 = (JavaTextbook) book4;//book4 was the interface reference, we cast the reference to be a JavaTextbook and assigned it to the book5 reference
        book5.read();
        book5.open();
    }
}
