package day46_static;

public class UsingIphoneClass {
    public static void main(String[] args) {

        Iphone phone = new Iphone("iphone x",1000);
        System.out.println(phone);

        Iphone phone2 = new Iphone ("Iphone 11", 1200);
        System.out.println(phone2);

        System.out.println(Iphone.company);
        System.out.println(Iphone.os);
    }
}
