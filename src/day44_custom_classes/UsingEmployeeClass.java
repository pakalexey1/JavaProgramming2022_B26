package day44_custom_classes;

public class UsingEmployeeClass {
    public static void main(String[] args) {

        Employee employee1 = new Employee("James","Secret Agent");
        System.out.println(employee1);

        Employee employee2 = new Employee("Hambone", 01, "Actor", 1_000_000);
        System.out.println(employee2);

    }
}
