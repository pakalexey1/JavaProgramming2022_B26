package day56_polymorphism.book;

public class Library {
    public static void main(String[] args) {
        JavaTextbook book1 = new JavaTextbook();
        book1.name = "Java Programming";
        book1.size = 20.5;
        book1.fun = true;
        book1.read();
        book1.open();
        book1.download();

        EBook book2 = new JavaTextbook();
        book2.name = "Java Programming";
        book2.size = 20.5;
        //book2.fun = true; -> not part of EBook class
        ((JavaTextbook)book2).fun=true; //downcasting allows accessing child class's method
        book2.read();
        book2.open();
        book2.download();

        Book book3 = new JavaTextbook();
        book3.name = "Java Programming";
        //book3.size = 20.5; -> not part of Book class
        //book3.fun = true; -> not part of Book class
        book3.read();
        //book3.open(); -> not part of Book class
        //book3.download(); -> not part of Book class


        Downloadable book4 = new JavaTextbook();
//        book4.name = "Java Programming";
//        book4.size = 20.5;
//        book4.fun = true;
//        book4.read();
//        book4.open();
        book4.download();
        //The only thing accessible by the Downloadable interface is teh download() method

        JavaTextbook book5 = (JavaTextbook)book4;
        // book4 was the interface referece, we cast teh reference to be a JavaTextbook and assigned it to the book5
        // reference. Now via book5 object all the variables and methods are accessible.
        book5.read();
        book5.open();
    }
}
