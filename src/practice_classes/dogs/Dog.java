package practice_classes.dogs;

public class Dog {
    String name;
    String breed;
    String size;
    int age;
    String color;

    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
