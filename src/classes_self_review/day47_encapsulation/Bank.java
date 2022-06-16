package classes_self_review.day47_encapsulation;

public class Bank {
    public static void main(String[] args) {
        System.out.println(DebitCard.accountType);


        DebitCard obj1 = new DebitCard(1234123412341324l,"James Bond",10_000);
        System.out.println(obj1);

        System.out.println("====================");
        DebitCard obj2 = new DebitCard(1234567891234567l,"Joe Doe",11_000);
        System.out.println(obj2);
        System.out.println(DebitCard.accountType);

        System.out.println("====================");
        DebitCard obj3 = new DebitCard(1234123412341324l,"Jimmy","Visa",7000,100000);
        obj3.cardNumber=123;//wouldn't be possible with encapsulation
        System.out.println(obj3);

        System.out.println("====================");
        DebitCard obj4 = new DebitCard(12341234123414l,"Mark","Mir",12,100000);
        System.out.println(obj4);

    }
}
