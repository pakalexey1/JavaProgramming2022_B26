package classes_self_review.day54_abstraction.animal;

import classes_self_review.day54_abstraction.language_interface.Language;

public final class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Parrot wobbles over to the seed");
    }

    @Override
    public void fly(){
        System.out.println("Parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("Parrot says hiiii");
    }

    @Override
    public void bye() {
        System.out.println("Parrot says byeeee");
    }
}
