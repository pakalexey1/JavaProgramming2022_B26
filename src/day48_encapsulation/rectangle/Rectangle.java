package day48_encapsulation.rectangle;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public int calculateArea(){
        return width*length;
    }

    public int calculatePerimeter(){
        return (width+length)*2;
    }

    public String toString(){
        return "Rectangle has a width of: " + width +" and a length of: " + length + ". It's perimeter is " + calculatePerimeter() + " and it's area is " + calculateArea();
    }

}

/*
    create a class called Rectangle

        - data:

            length, width

        - constructor

            - create a constructor that creates a Rectangle object with the length and the width

            	call setters here

        - encapsulate the Rectangle class

        	- setter condition: length and width must both be a positive number otherwise they will not be assigned to the instance variable

        - other methods methods:

            - calculateArea()
  				calculate and return the area of a Rectangle

            - calculatePerimeter()
  				calculate and return the perimeter of a Rectangle

            - toString()
                print the length, width, area, and perimeter of the Rectangle object

    Create a separate class to create and test the Rectangle objects
 */