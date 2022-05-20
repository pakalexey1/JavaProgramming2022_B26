package classes_self_review.carpet;

public class UseCarpet {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(8.5, 12, true, 2.5);
        System.out.println(carpet1);
        carpet1.length = 14;

        System.out.println("-------------------");
        carpet1.calculatePrice();
        System.out.println(carpet1);

    }

}
