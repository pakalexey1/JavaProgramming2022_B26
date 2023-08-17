package aJavaDevCourse.day03_lambdaP2.fucntionalInterfaces.usersPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class userTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("Mike").lastName("Smith").age(35).build());
        users.add(User.builder().firstName("Tom").lastName("Johns").age(55).build());
        users.add(User.builder().firstName("Ammy").lastName("Evans").age(15).build());
        users.add(User.builder().firstName("John").lastName("Edoe").age(25).build());

        //print all elements in the list
        printName(users, p -> true); //using method in the bottom it accepts two parameters:
                                    //a List, so I put "users" List and an implementation of the
                                    //functional interface (b -> true). The method should have the
                                    //same signature as the Predicate interface - accept
                                    //an object and return a boolean

        System.out.println("-----------------------");
        //Print all users that last name starts with E
        printName(users, user-> user.getLastName().startsWith("E"));

    }

    private static void printName(List<User> users, Predicate<User> p){
        for (User user : users){
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
