package classes_self_review.day42_custom_classes.app;

public class App {
    String name;
    double version;
    boolean isFree;

    public void run() {
        System.out.println(name + " is running");
    }

    public void update() {
        System.out.println(name + " has been updated");
        version += 1.1;
    }
}