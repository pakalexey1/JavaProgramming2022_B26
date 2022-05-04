package day53_abtraction.cars;

public class Tesla extends ElectricCar{

    @Override
    public void start(){
        System.out.println("Card in the car");
        System.out.println("Press button");
    }

    @Override
    public void charge(){
        System.out.println("Charging tesla");
    }
}

/*
the Tesla class is a sub class of the ELectrcCar class

the ElectricCar class is abstract and the TEsla class is not abstract

normal class cannot have absrtact methods

so, we have to override any/all abstract methods that were inherited
 */
