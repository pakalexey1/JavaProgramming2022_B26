package classes_self_review.day42_custom_classes.animals;

public class Animal {
    String species;
    long population;

    public String toString(){
        String print = "Species: " + species;
        print += "\nPopulation: " + population;
        return print;
    }
}
