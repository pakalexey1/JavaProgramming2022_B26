package day29_arrays;

public class ReplitAverageTemp {
    public static void main(String[] args) {

        double[] temps = {80, 88, 88, 84, 82, 78, 60, 68};
        double sumOfTemps = 0;

        for (int i = 0; i < temps.length; i++) {
            sumOfTemps+=temps[i];
        }
        System.out.println(sumOfTemps/temps.length);

    }
}
