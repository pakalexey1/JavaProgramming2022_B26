package day54_abstraction.book;

public class JavaTextbook extends EBook {

    boolean isFun;

    @Override
    public void read(){
        System.out.println("Reading the " + name + " book");
    }

    @Override
    public void download(){
        System.out.println("Downloading " + name + " the book");
    }

    @Override
    public void open(){
        System.out.println("Opening the " + name +  " book");
    }

}

/*Create a concrete class JavaTextbook
    - Inherits EBook
    - Declare a fun variable
    - Override all abstract methods

 */