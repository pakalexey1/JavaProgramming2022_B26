package day48_encapsulation.rectangle;

public class UsingRectangleClass {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(4,6);
        System.out.println(rec1);

        rec1.setWidth(20);
        rec1.setLength(25);
        System.out.println(rec1);

    }
}
