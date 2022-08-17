package classes_self_review.day56_polymorphism;

public class JavaTextbook extends EBook{

    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading Java Textbook");
    }

    @Override
    public void download() {
        System.out.println("Downloading Java Textbook");
    }

    @Override
    public void open() {
        System.out.println("Opening Java Textbook");
    }
}

/*
Create a concrete class JavaTextbook
- Inherits Ebook
- Declare a fun variable
- Override all abstract methods
 */