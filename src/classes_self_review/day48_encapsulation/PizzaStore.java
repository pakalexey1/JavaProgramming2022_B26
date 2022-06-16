package classes_self_review.day48_encapsulation;

public class PizzaStore {
    public static void main(String[] args) {

        Pizza pizzaOne = new Pizza("large",3);
        System.out.println(pizzaOne);
        //pizzaOne.numberOfToppings = 2;
        pizzaOne.setNumberOfToppings(2);
        System.out.println(pizzaOne);

        Pizza pizzaTwo = new Pizza("",-2);
        System.out.println(pizzaTwo);
    }
}
