package day42_custom_classes;

public class AllPeople {
    public static void main(String[] args) {
//        System.out.println(Person.name);
//        System.out.println(Person.age);

        Person personOne = new Person(); // creates an object of the Person class

        Person persontwo = new Person(); // creates another object of the Person class

        //Accessing the instance variables

        personOne.name = "James";
        personOne.age = 40;
        personOne.height = 5.10;
        personOne.isMarried = false;

        System.out.println(personOne.name);
        System.out.println(personOne.age);
        System.out.println(personOne.height);
        System.out.println(personOne.isMarried);

        //pritning the instance variable for personTwo

        System.out.println();

        System.out.println(persontwo.name);
        System.out.println(persontwo.age);
        System.out.println(persontwo.height);
        System.out.println(persontwo.isMarried);
    }
}
