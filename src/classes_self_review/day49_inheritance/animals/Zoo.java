package classes_self_review.day49_inheritance.animals;



public class Zoo {
    public static void main (String[] args){
        Animal animal1 = new Animal();
        animal1.species = "Generic Animal";
        animal1.numberOfLegs = 0;
        animal1.walk();

        Dog dog1 = new Dog();
        dog1.species = "Dog";
        dog1.numberOfLegs = 4;

        Lion lion1 = new Lion();
        //Q: How many instance variables does the lion object have access to?
        //A: 3

        //Q: How many instance methods does the lion object have access to?
        //A: 2

        lion1.roar();
        lion1.species = "Lion";
        lion1.walk();

    }
}
