package aJavaDevCourse.week03_lambdaP2.orangeColor;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());

        OrangeFormatter simpleFormatter = orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrintApple(inventory,simpleFormatter);

        System.out.println("------------------------");

        OrangeFormatter fancyFormatter = orange -> {
            String charachteristic = orange.getWeight()>150? "Heavy" : "Light";
            return "A " + charachteristic + " " + orange.getWeight() + " orange";
        };

        prettyPrintApple(inventory,fancyFormatter);
    }

    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter orangeFormatter){
        for (Orange orange: inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
