package aJavaDevCourse.week04_streams.flatMap;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Employee {
    private int empId;
    private String empName;
    private String empEmail;
    private List<String> empPhoneNumber;
}
