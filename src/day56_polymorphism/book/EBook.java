package day56_polymorphism.book;

public abstract class EBook extends Book implements Downloadable{
    double size;
    public abstract void open();
}

/*
Create an abstract class Ebook
    - Inherit Book and implement Downloadable
    - Declare a size variable
    - Declare an abstract method:
        open()
 */
