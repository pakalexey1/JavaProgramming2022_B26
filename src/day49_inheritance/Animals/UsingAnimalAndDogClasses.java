package day49_inheritance.Animals;

public class UsingAnimalAndDogClasses {
    public static void main (String[] args) {

        Animal animal = new Animal();
        animal.species = "Generic Animal";
        animal.numberOfLegs = 0;
        animal.walk();

        Dog dog = new Dog();
        dog.species = "Dog";
        dog.numberOfLegs = 4;

        Lion lion = new Lion();
        //q: how many instance variables does the lion object have access to?
        //a: 3 - species, number of legs, mainSize

        //q: how many instance methods does the lion object have access to?
        //a: 2 - walk and roaring

        lion.roar();
        lion.species = "Big cat";
         lion.walk();
    }
}
