package day53_abtraction.exercise;

public abstract class Exercise {

    final String name;
    int calories;

    public Exercise (String name, int calories){
        this.name = name;
        this.calories= calories;
    }

    public abstract void performExercise();
    public abstract int getCaloriesBurned(int minutes);
}
