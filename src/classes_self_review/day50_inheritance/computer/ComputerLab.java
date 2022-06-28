package classes_self_review.day50_inheritance.computer;

public class ComputerLab {
    public static void main(String[] args) {

        Computer comp1 = new Computer("Generic OS",300);
        System.out.println(comp1);

        Windows comp2 = new Windows(500);
        System.out.println(comp2);

        Mac comp3 = new Mac(500);
        System.out.println(comp3);
    }
}
