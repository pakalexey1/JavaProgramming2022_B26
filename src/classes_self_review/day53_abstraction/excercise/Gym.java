package classes_self_review.day53_abstraction.excercise;

public class Gym {
    public static void main(String[] args) {

//        Exercise obj1 = new Exercise(""); Can't create an object from an abstract class

        Running obj2 = new Running();
        System.out.println(obj2.name);
        obj2.performExercise();
        System.out.println(obj2.getCaloriesBurned(20));


    }
}
