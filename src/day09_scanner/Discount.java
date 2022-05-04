package day09_scanner;

public class Discount {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isTeacher = false;
        boolean isPoliceman = true;
        boolean isFirefighter = false;

        boolean hasDiscount = isTeacher|| isFirefighter|| isPoliceman &&isWeekend;
        System.out.println("You get a discount "+hasDiscount);

    }
}
