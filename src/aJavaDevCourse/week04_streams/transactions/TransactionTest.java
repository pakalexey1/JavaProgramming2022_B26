package aJavaDevCourse.week04_streams.transactions;

import java.util.Optional;

import static java.util.Comparator.comparing;

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
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(trader -> trader.getCity())) //same as sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("\nReturn a string of all trader's names sorted alphabetically");
        String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (name1, name2) -> name1 + name2 + " "); //the output is a string, that's why forEach doesn't work as it's a stream method
        System.out.println(result);

        System.out.println("\nAre there any traders from Milan?");
        boolean milanBased = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));

        System.out.println("\nPrint the values of all transactions from the traders living in Cambridge");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("\nWhat is the highest value of all the transactions");
        Optional<Integer> highest = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(highest.get());

        System.out.println("\nFind the transactions with the smallest value");
        Optional<Transaction> smallest = TransactionData.getAll().stream()
                .reduce((tran1,tran2)->tran1.getValue()<tran2.getValue() ? tran1 : tran2);
        System.out.println(smallest.get());

        //The same but using min() method
        Optional<Transaction> smallest2 = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));
        System.out.println(smallest2.get());
    }
}
