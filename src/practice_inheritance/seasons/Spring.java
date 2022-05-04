package practice_inheritance.seasons;

public class Spring extends Season {
    public Spring(double highestAverage, double lowestAverage) {
        super("Spring", highestAverage, lowestAverage);
    }

    @Override
    public void activity(){
        System.out.println("Go Outside");
    }

    @Override
    public String toString() {
        return "Spring{" +
                "name='" + name + '\'' +
                ", highestAverage=" + highestAverage +
                ", lowestAverage=" + lowestAverage +
                '}';
    }
}
