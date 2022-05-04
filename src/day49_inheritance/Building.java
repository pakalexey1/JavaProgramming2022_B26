package day49_inheritance;

public class Building {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "James Bond";
        person1.age = 40;
        person1.hobby = "spy stuff";

        Student person2 = new Student();
        person2.name = "Jorge";
        person2.age = 10;
        person2.hobby = "drawing";
        person2.stressLevel = 100;
        person2.study();
        // the above variables and methods were inheritd from the Person class


    }
}
