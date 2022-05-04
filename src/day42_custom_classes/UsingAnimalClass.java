package day42_custom_classes;

public class UsingAnimalClass {
    public static void main(String[] args) {
        Animal bird = new Animal();
        bird.population = 1000000;
        bird.species="Bird";

        //before approach:
        System.out.println(bird);
        System.out.println(bird.toString());// not how we will use it


    }
}
