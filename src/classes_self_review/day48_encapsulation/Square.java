package classes_self_review.day48_encapsulation;

public class Square {

    /*
create a class called square
    - data:
        side
 */
    private int side;

    /*
    - Constructor
        - create a constructor that creates a Square object with the side
            call setter here

         - encapsulate the Square class
            - setter condition: side must be a positive number otherwise it will not be assigned to the instance
            variable
     */

    public Square(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        }
    }

    public int calculateArea() {
        return side * side;
    }

    public int calculatePerimeter() {
        return side * 4;
    }

    public String toString() {
        return "Side of Square: " + side + " | Area: " + calculateArea() + " | Perimeter: " + calculatePerimeter();
    }

    /*
    - other methods:
        - calculateArea()
            calculate and return the area of a Square

        - calculatePerimeter()
            calculate and return the area of a Square

        - toString()
            print the side, area, and perimeter of the Square object

     */


}


