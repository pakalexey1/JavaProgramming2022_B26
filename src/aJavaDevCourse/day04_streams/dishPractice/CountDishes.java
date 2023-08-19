package aJavaDevCourse.day04_streams.dishPractice;

public class CountDishes {
    public static void main(String[] args) {

        int dishCount = DishData.getAll().stream().map(d -> 1).reduce(0, (a, b) -> a + b);
        System.out.println(dishCount);

        long dishCount2 = DishData.getAll().stream().count();
        System.out.println(dishCount2);

    }
}
