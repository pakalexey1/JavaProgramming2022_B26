package day44_custom_classes;

public class ChainExample {

    public ChainExample(){
        // this (4); this is not valid because hte chaining contains themselves
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
