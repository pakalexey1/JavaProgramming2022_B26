package aJavaDevCourse.week03_lambdaP2.functionalInterfaceAgain.usersPracticeAgain;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User("Mike","Jones",12));
        userList.add(new User("John","Michaels",19));
        userList.add(new User("Ethan","Smith",50));
        userList.add(new User("Edward","Jackson",19));

        //Print all elements in the list
        printUsers(userList,predicate -> true);

        System.out.println("------------------------");
        //Print all elements in the list starting with E
        printUsers(userList, userOrAnythingLese-> userOrAnythingLese.getFirstName().startsWith("E"));
        //the part after -> is being placed into line 28 (if statement)
    }

    private static void printUsers(List<User> userList, Predicate<User> predicate){
        for (User user : userList){
            if (predicate.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
