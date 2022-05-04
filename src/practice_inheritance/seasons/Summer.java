package practice_inheritance.seasons;

public class Summer extends Season{
    public Summer (double highestAverage, double lowestAverage){
        super("Summer", highestAverage, lowestAverage);
    }

    @Override
    public void activity(){
        System.out.println("Drink lemonade");
    }

    @Override
    public String toString() {
        return "Summer{" +
                "name='" + name + '\'' +
                ", highestAverage=" + highestAverage +
                ", lowestAverage=" + lowestAverage +
                '}';
    }
}
