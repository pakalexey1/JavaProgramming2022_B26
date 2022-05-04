package practice_classes;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

//    emp1.name = "Jose";
//    emp1.salary = 4705005;

        emp1.setName("Jose");
        emp1.setSalary(4705005);
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());
    }
}
