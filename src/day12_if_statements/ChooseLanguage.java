package day12_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please choose a language: \n\t1 - English\n\t2 - Spanis\n\t3- Turkish\n\t4 - Русский\n\t5 - Frence");
        int num = input.nextInt();

        if (num == 1) {
            System.out.println("Hello, thank you for your call");
        } else if (num == 2) {
            System.out.println("Hola, gracias para llamar");
        } else if (num == 3) {
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        } else if (num == 4) {
            System.out.println("Здравствуйте, спасибо за ваш звонок");
        } else {
            System.out.println("Merci, pour votre appel");
        }

    }
}
