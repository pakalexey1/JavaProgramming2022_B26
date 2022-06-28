package classes_self_review.day51_inheritance.shapes;

public class Circle extends Shape{

    double radius;

    public Circle (double radius){
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
