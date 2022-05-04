package practice_classes.dogs;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.size = "Large";
        dog1.age = 5;
        dog1.color = "Brown";

        System.out.println(dog1);

        Dog dog2 = new Dog ();
        dog2.name = "Billy";
        dog2.breed = "Chihuahua";
        dog2.size = "Small";
        dog2.age = 12;
        dog2.color = "Red";
        System.out.println(dog2);


    }
}
