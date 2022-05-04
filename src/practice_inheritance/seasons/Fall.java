package practice_inheritance.seasons;

public class Fall extends Season {
    public Fall (double highestAverage, double lowestAverage){
        super("Fall", highestAverage, lowestAverage);
    }

    @Override
    public void activity() {
        System.out.println("Read a book");
    }

    @Override
    public String toString() {
        return "Fall{" +
                "name='" + name + '\'' +
                ", highestAverage=" + highestAverage +
                ", lowestAverage=" + lowestAverage +
                '}';
    }
}
