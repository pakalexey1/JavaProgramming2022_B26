package practice_classes.employees;

public class Employee {
    String name;
    String jobTitle;
    char gender;
    double salary;

    public Employee(String name, String jobTitle, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
