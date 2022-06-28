package classes_self_review.day53_abstraction.excercise;

public abstract class Exercise {

    final String name;

    public Exercise(String name){
        this.name = name;
    }

    public abstract void performExercise();

    public abstract int getCaloriesBurned(int minutes);

}
