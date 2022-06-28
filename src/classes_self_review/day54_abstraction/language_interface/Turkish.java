package classes_self_review.day54_abstraction.language_interface;

public class Turkish implements Language{
    @Override
    public void hi() {
        System.out.println("Merhaba");
    }

    @Override
    public void bye() {
        System.out.println("Gule Gule");
    }
}
