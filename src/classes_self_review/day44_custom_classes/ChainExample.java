package classes_self_review.day44_custom_classes;

public class ChainExample {
    public ChainExample(){
        System.out.println("First");
    }

    public ChainExample(int i){
        this();
        System.out.println("Second");
    }

    public ChainExample(String s){
        this();
        System.out.println("Third");
    }

    public ChainExample(double d){
        this(0);
        System.out.println("Fourth");
    }
}
