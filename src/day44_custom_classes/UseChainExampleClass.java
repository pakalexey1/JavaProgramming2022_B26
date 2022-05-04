package day44_custom_classes;

public class UseChainExampleClass {
    public static void main(String[] args) {

        new ChainExample(10);
        System.out.println("=====================");

        new ChainExample("Hello");

        System.out.println("=====================");
        new ChainExample(4.2);

    }
}
