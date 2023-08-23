package aJavaDevCourse.week03_lambdaP2;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build()); //using @Builder annotation from Orange class
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());

        OrangeFormatter simpleFormatter = orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrintApple(inventory, simpleFormatter);
        System.out.println("=-=-=-=-=-=-=-=-=");
        prettyPrintApple(inventory, orange -> "An orange of " + orange.getWeight() + "g");//the same as the other method, but with Lambda put directly inside as a parameter

        OrangeFormatter fancyFormatter = orange -> {
            String characteristic = orange.getWeight()> 150 ? "Heavy" : "Light";
            return "A " + characteristic + " " + orange.getColor() + "orange";
        };
        System.out.println("------------------");
        prettyPrintApple(inventory,fancyFormatter);


    }

    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange orange: inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
