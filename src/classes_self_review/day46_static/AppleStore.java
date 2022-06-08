package classes_self_review.day46_static;

import day43_custom_classes.Phone;

public class AppleStore {
    public static void main(String[] args) {
        IPhone phone1 = new IPhone("iPhone X", 1000);
        System.out.println(phone1);
        IPhone phone2 = new IPhone("Iphone 11",1100);
        System.out.println(phone2);

        System.out.println(IPhone.company);
        System.out.println(IPhone.os);
    }
}
