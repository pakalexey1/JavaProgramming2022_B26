package classes_self_review.day42_custom_classes.items;

public class Item {
    String name;
    double price;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
