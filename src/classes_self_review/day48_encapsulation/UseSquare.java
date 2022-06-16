package classes_self_review.day48_encapsulation;

public class UseSquare {
    public static void main(String[] args) {

        Square obj = new Square(5);
        System.out.println(obj); //prints: Side of Square: 5 | Area: 25 | Perimeter: 20

//        obj.side = 11; can't do that, because side variable is private

        obj.setSide(11);
        System.out.println(obj.getSide()); // prints: 11
        System.out.println(obj); // prints: Side of Square: 11 | Area: 121 | Perimeter: 44
    }
}
