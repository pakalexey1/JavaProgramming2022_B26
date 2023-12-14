package practice2023.Objects;

public class Book {
    public int pages;
    public String name;

    public Book(int pages, String name){
        this.pages=pages;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", name='" + name + '\'' +
                '}';
    }
}
