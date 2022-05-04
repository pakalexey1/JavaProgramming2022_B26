package day47_encapsulation;

public class UsingTrafficLightClass {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("Red");
//        System.out.println(light.color);
//
//        light.color = "pink";

        TrafficLight light2 = new TrafficLight("red");
        System.out.println(light2.getColor());

        light2.setColor("grey");// won't change from red, because switch statement won't allow it
        System.out.println(light2.getColor());

        light2.setColor("green");
        System.out.println(light2.getColor());


    }
}
