package aJavaDevCourse.day04_streams.transactions;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class TransactionTest {
    public static void main(String[] args) {

        System.out.println("Find all transactions in 2011 and sort by value");

        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(transaction -> transaction.getValue())) //same as sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("\nWhat are the unique cities the traders work at?");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("\nFind all traders from Cambridge and sort them by name");
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("\nReturn a string of all trader's names sorted alphabetically");
        String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (name1, name2) -> name1 + name2); //the output is a string, that's why forEach doesn't work as it's a stream method


    }
}
