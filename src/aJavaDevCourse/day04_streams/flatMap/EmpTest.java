package aJavaDevCourse.day04_streams.flatMap;

public class EmpTest {
    public static void main(String[] args) {
        System.out.println("Print all emails");

        EmpData.readAll()
                .map(Employee::getEmpEmail) //the same as employee->employee.getEmpEmail()
                .forEach(System.out::println);

        System.out.println("\nPrint all phone numbers");

        EmpData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .forEach(System.out::println);
    }
}
