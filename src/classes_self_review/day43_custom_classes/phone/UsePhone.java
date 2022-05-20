package classes_self_review.day43_custom_classes.phone;

public class UsePhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("iphone");
        System.out.println(phone1);


        Phone phone2 = new Phone("iphone", "Apple");
        System.out.println(phone2);

        Phone phone3 = new Phone ("Galaxy s22", "Samsumg", 128, 10.2);
        System.out.println(phone3);
    }
}
