package classes_self_review.day53_abstraction.excercise;

public class Running extends Exercise {

    public Running(){
        super("Running");
    }

    @Override
    public void performExercise(){
        System.out.println("Running for fun");
    }
    @Override
    public int getCaloriesBurned(int minutes){
        return minutes * 5;
    }
}
