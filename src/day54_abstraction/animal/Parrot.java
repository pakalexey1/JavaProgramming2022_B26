package day54_abstraction.animal;

import day54_abstraction.language.Language;

public class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat(){
        System.out.println("The parrot is eating");
    }

    @Override
    public void fly(){
        System.out.println("The parrot is flying");
    }

    @Override
    public void hi(){

    }

    @Override
    public void bye(){

    }

}
