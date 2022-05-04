package day43_custom_classes;

public class UseCarpetClass {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(8.5,12,false,2.5);
        System.out.println(carpet1);

        carpet1.length = 14;
        carpet1.calculatePrice();
        System.out.println(carpet1);

    }
}
