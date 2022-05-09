package day55_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {
        // all possible reference/object of Lizard

        //itself
        Lizard lizard = new Lizard();
        lizard.eat();
        lizard.name ="Lizy";
        lizard.numberOfClaws = 10;
        lizard.skinColor = "camo";
        System.out.println(lizard.name);
        System.out.println(lizard.numberOfClaws);
        System.out.println(lizard.skinColor);

        // super class - reptile
        Reptile reptile = new Lizard();
        reptile.eat();

        // super class - animal
        Animal animal = new Lizard();
        animal.eat();
        animal.name = "Lizy";
        //animal.numberOfClaws = 10; // animal reference doesn't have access to numberOfClaws variable
    }
}
