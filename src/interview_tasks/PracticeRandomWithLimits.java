package interview_tasks;

public class PracticeRandomWithLimits {
    public static int random_int(int Min, int Max) {
        return (int) (Math.random() * (Max + 1 - Min)) + Min;
    }
}

    /*
    Generates random numbers with parameters being lower and upper limits of the random number range.
    Both min and max are inclusive.
     */
