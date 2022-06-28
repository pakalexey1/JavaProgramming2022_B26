package classes_self_review.day54_abstraction.language_interface;

public class RunnerClass {
    public static void main(String[] args) {

        Spanish spanish = new Spanish();
        spanish.hi();
        spanish.bye();

        Turkish turkish = new Turkish();
        turkish.hi();
        turkish.bye();
    }
}
