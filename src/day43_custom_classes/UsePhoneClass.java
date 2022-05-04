package day43_custom_classes;

public class UsePhoneClass {
    public static void main(String[] args) {

        Phone phoneOneArg = new Phone("iPhone");// calls the constructor on line 10 of Phone.java class
        System.out.println(phoneOneArg);

        Phone phoneTwoArgs = new Phone ("iPhone", "Apple"); // calls teh constructor on lin 14 of Phone.java class
        System.out.println(phoneTwoArgs);

        Phone phoneFourArgs = new Phone("Galaxy s22", "Samsung", 128,10.2); // calls teh constructor on line 19 of Phone.java class
        System.out.println(phoneFourArgs);

    }
}
