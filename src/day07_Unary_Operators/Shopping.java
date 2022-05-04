package day07_Unary_Operators;

public class Shopping {
    public static void main(String[] args) {

        int numberOfItems = 0;
        double price = 0.0;

        System.out.println("We pick up 1 water");
        System.out.println("how many items in the car: " + ++numberOfItems);
        price = price + 2.5;

        System.out.println("we pick up 2 eggs");
        System.out.println("how many items in the car: " + ++numberOfItems);
        System.out.println("how many items in the car: " + ++numberOfItems);

        System.out.println(numberOfItems++);


    }
}
