package classes_self_review.day53_abstraction.cars;

public class Tesla extends ElectricCar{

    @Override
    public void start(){
        System.out.println("card in the car");
        System.out.println("press button");
    }

    @Override
    public void charge(){
        System.out.println("charging the car");
    }


}
