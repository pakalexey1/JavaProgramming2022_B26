package practice_inheritance.seasons;

public class Winter extends Season {
    public Winter(double highestAverage, double lowestAverage){
        super("Winter",highestAverage,lowestAverage);
    }

    @Override
    public String toString() {
        return "Winter{" +
                "name='" + name + '\'' +
                ", highestAverage=" + highestAverage +
                ", lowestAverage=" + lowestAverage +
                '}';
    }

    @Override
    public void activity(){
        System.out.println("Using the fireplace");
    }
}
/*
Create a class Winter

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Print Use Fireplace
 */