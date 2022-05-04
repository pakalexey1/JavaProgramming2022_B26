package day48_encapsulation.pizza;

public class UsePizzaClass {
    public static void main(String[] args) {

        Pizza piz1 = new Pizza("large",3);
        System.out.println(piz1);

        piz1.setNumberOfToppings(2);
        System.out.println(piz1);

        Pizza piz2 = new Pizza("", -2);
        System.out.println(piz2);

        piz2.setSize("Small");
        piz2.setNumberOfToppings(1);
        System.out.println(piz2);

    }
}
