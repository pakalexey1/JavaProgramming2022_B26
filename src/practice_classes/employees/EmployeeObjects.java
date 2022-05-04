package practice_classes.employees;

public class EmployeeObjects {
    public static void main(String[] args) {


        Employee emp1 = new Employee("Josh","SDET",'M',700000);
        Employee emp2 = new Employee ("Hambone", "SDET", 'F', 4000000);

        System.out.println(emp1);
        System.out.println(emp2);
    }
}
