package classes_self_review.day49_inheritance;

public class BuildingPeople {
    public static void main(String[] args) {
        Person obj1 = new Person();
        obj1.name = "James Bond";
        obj1.age = 40;
        obj1.favoriteHobby = "Spy stuff";
        obj1.talk();
        //obj1.study(); the method was done in the child class Student

        Student obj2 = new Student();
        obj2.name = "Jorge";
        obj2.age = 10;
        obj2.favoriteHobby = "drawing";
        obj2.talk();

        obj2.funLevel = 100;
        obj2.study();
    }
}
