package classes_self_review.day56_polymorphism;

public abstract class EBook extends Book implements Downloadable{

    double size;

    public abstract void open();

}
/*
Create an abstract class EBook
- Inherits Book and implements Downloadable
- Declare a size variable
- Declare an abstract method:
    open()
 */