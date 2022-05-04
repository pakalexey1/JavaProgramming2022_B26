package day53_abtraction.exercise;

public class Running extends Exercise{

    public Running(double calories){
        super("Running",5);
    }

    @Override
    public void performExercise() {
        System.out.println("Running for fun, not sure who does this");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * calories;
    }
}
