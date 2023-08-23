package aJavaDevCourse.week02_lambda.appleSortingHomeWork;

import java.util.ArrayList;
import java.util.List;

public class AppleData {
    public static List<Apple> allApples() {
        List<Apple> listOfApples = new ArrayList<>();
        listOfApples.add(new Apple(100, Color.RED));
        listOfApples.add(new Apple(150, Color.GREEN));
        listOfApples.add(new Apple(400, Color.RED));
        listOfApples.add(new Apple(500, Color.GREEN));

        return listOfApples;
    }
}
