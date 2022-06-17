package classes_self_review.day50.book;

public class Ebook extends Book {
    double size;
    int pages;

    public void read(){
        System.out.println("Reading a digital copy of " + title);
    }

}

/*
 - Ebook class inherits Book class
 - create additional variables:
    size, pages
 - create method:
    read()
           Example output: prints Reading a digital copy of $title
 */