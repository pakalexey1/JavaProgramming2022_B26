package classes_self_review.day44_custom_classes.employee;

public class Employee {
    String name;
    String jobTitle;
    double salary;
    int id;

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }

    public void goToMeeting(){
        System.out.println(name + " is going to a meeting");
    }

    public String toString (){
        return name + " - " + jobTitle + " - " + id + " - $" + salary;
    }

}
