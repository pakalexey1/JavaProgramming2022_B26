package day48_encapsulation.square;

public class UseSquareClass {
    public static void main(String[] args) {
        Square obj = new Square(5);
        System.out.println(obj);

        // obj.side = 11; can't change the value like this beacuse it has priavte access

        obj.setSide(11);
        System.out.println(obj.getSide());
        System.out.println(obj);

    }


}
