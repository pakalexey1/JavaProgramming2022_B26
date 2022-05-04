package practice_classes.static_example;

public class StaticBlock {
    public static int a = 100;
    public static String str = "Java";
    public static char ch = 'A';

    static {
        a = 100;
        str = "Java";
        ch = '@';
    }
}
