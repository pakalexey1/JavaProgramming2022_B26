package aJavaDevCourse.day03_lambdaP2.fucntionalInterfaces.UsersPractice;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {

    private String firstName;
    private String lastName;
    private int age;

}
