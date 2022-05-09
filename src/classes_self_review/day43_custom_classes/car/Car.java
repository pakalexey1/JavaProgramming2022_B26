package classes_self_review.day43_custom_classes.car;

public class Car {
    String model;
    int year;
    String color;
    double fuel;

    public  String toString(){
        return  color + " " + year + " " + model + " has " + fuel + " gallons of gas. The fuel is low: "+isLow();
    }

    public void drive(){
        System.out.println(model + " is driving ");
        fuel -= 5;
    }

    public void fillTank(){
        System.out.println("Filling tank");
        fuel = 100;
    }

    public boolean isLow (){
        if (fuel<25){
            return true;
        }else{
            return false;
        }
    }
}
