package classes_self_review.day44_custom_classes;

public class TestChainExample {
    public static void main(String[] args) {
        new ChainExample(10);
        System.out.println("=================");
        new ChainExample("hello");
        System.out.println("=================");
        new ChainExample(.2);
    }
}
