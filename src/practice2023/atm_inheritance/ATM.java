package practice2023.atm_inheritance;

import day52_inheritance.hiding.B;
import day58_exceptions.bank.Bank;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double initialBalance = 1000;

        BankAccount account = new BankAccount(initialBalance);

        account.checkBalance();
        account.withdraw(901);
        account.deposit(500);
        account.checkBalance();

    }
}
