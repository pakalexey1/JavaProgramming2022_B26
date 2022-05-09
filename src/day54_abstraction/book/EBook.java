package day54_abstraction.book;

public abstract class EBook extends Book implements Downloadable {

    double size;
    public abstract void open();

}

/*
Create an abstract class EBook
    - Inherits Book and implements Downloadable
    - Declare a size variable
    - Declare an abstract methods:
        open()
 */
