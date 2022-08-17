package classes_self_review.day55_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        //all possible reference/objects of Lizard

        Lizard lizard1 = new Lizard();
        lizard1.eat();
        lizard1.name = "Jeff";
        lizard1.numberOfClaws = 10;
        lizard1.skinColor = "camo";
        System.out.println(lizard1.name);
        System.out.println(lizard1.numberOfClaws);
        System.out.println(lizard1.skinColor);
        System.out.println("=======================");

        Reptile lizard2 = new Lizard();
        lizard2.eat();
        lizard2.name = "Mark";
        //lizard2.skinColor="red"; reptile doesn't skinColor variable, because it's coming from a child class.
        lizard2.numberOfClaws = 12;
        System.out.println(lizard2.name);
        System.out.println(lizard2.numberOfClaws);

        Animal lizard3 = new Lizard();
        lizard3.eat();
        lizard3.name = "Time";
        //lizard3.numberOfClaws = 14;

    }
}
