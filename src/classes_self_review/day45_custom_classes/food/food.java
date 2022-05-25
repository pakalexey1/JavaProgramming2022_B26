package classes_self_review.day45_custom_classes.food;

import day45_custom_classes.Food;

public class food {
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public food(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public void calculatePrice() {
       totalPrice = quantity*unitPrice;
    }

    @Override
    public String toString() {
        return "food{" + "name='" + name + ", quantity=" + quantity +", unitPrice=" + unitPrice + "for the total of: " + totalPrice+'}';
    }


}
