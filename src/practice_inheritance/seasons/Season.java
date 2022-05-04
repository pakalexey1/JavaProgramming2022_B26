package practice_inheritance.seasons;

public class Season {

    String name;
    double highestAverage;
    double lowestAverage;

    public Season (String name, double highestAverage, double lowestAverage){
        this.name = name;
        this.highestAverage = highestAverage;
        this.lowestAverage = lowestAverage;
    }

    public void activity(){
        System.out.println("Doing the seasonal activity");
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAverage=" + highestAverage +
                ", lowestAverage=" + lowestAverage +
                '}';
    }
}

/*
Create a class Season

	instance variables
		- name (String)
		- highest average temperature
		- lowest average temperature

	constructor:
		- initialize all fields

	methods:
		- activity(), toString()

		override activity in sub classes
 */