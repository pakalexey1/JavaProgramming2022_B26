package classes_self_review.day44_custom_classes.employee;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John","SDET");
        System.out.println(emp1);

        Employee emp2 = new Employee("Eman", 25, "SDET", 125000);
        System.out.println(emp2);

        emp1.goToMeeting();
        emp2.goToMeeting();
    }
}
