package day54_abstraction.book;

public class Runner {
    public static void main(String[] args) {

        JavaTextbook book1 = new JavaTextbook();
        book1.isFun = false;
        book1.name = "Java for Professionals";
        book1.size = 2.5;
        book1.download();
        book1.open();
        book1.read();

        System.out.println("================");

        EBook book2 = new JavaTextbook();
        book2.name = "Java for Beginners";
        book2.size = 1.2;
        book2.download();
        book2.open();
        book2.read();

        System.out.println("------------------");

        Book book3 = new JavaTextbook();
        book3.name = "Java for Kids";
        book3.read();

        System.out.println("===================");

        Downloadable book4 = new JavaTextbook();
        book4.download();
    }
}
