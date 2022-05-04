package day47_encapsulation;

public class UsingDebitCardClass {
    public static void main(String[] args) {

        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard (1234567891112141L,"James", 10000000);
        System.out.println(obj1);

        System.out.println();
        DebitCard obj2 = new DebitCard (123456789111L,"Ben", 100000002);
        System.out.println(obj2);
        System.out.println(obj2.accountType);

        System.out.println();
        DebitCard obj3 = new DebitCard (1234567891112141L,"James","visa",7000, 10000000);
        System.out.println(obj3);

        System.out.println();
        DebitCard obj4 = new DebitCard (1234567891112L,"James","Money",7, 10000000);
        System.out.println(obj4);
    }
}
