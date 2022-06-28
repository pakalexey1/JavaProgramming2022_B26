package classes_self_review.day50_inheritance.book;

public class Library {
    public static void main(String[] args) {

        // not doing any inheritance here, just a main method to create my objects

        Book obj1 = new Book();
        //obj1 has access to 6 instance variables of the Book class

        AudioBook obj2 = new AudioBook();
        // ob2 has access to the 6 variables of the Book class and the 2 new variables of the AudioBook class:
        obj2.duration= 100;
        obj2.narrator = "Morgan Freeman";

        //obj2 has access to the instance method listen()
        obj2.title = "\"Java is fun\"";
        obj2.listen();

        Ebook obj3 = new Ebook();
        // obj3 has access to the 6 variables from the Book class and the 2 new variables in the Ebook class:
        obj3.size = 20.4;
        obj3.pages = 1002;
        obj3.title = "\"Soft skills are important\"";
        //obj3 has access to the instance method read()
        obj3.read();

        System.out.println("=====================");
        Book obj4 = new Book();
        obj4.author = new Author("JK Rowling",40);// made an Author object belongs to the Book obj4 object
        System.out.println(obj4.author); //Author{name='JK Rowling', age=40}

        obj4.author.setName("James Bond");
        System.out.println(obj4.author.getName()); //James Bond
        System.out.println(obj4.author.getAge()); //40






    }
}
