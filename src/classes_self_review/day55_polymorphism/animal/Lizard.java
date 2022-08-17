package classes_self_review.day55_polymorphism.animal;

public class Lizard extends Reptile{

    String skinColor;

    @Override
    public void eat(){
        System.out.println("LIZARD is eating");
    }

}
