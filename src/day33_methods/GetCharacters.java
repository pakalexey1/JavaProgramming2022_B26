package day33_methods;

public class GetCharacters {
    
    public static void lettersAZ () {
        char lettersAZ = 65;
        for (int i = 65; i < 91; i++) {
            System.out.print(lettersAZ= (char) i);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void lettersaz () {

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void lettersZA () {
        char lettersZA = 97;
        for (int i = 91; i > 64; i--) {
            System.out.print(lettersZA= (char) i);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void lettersza () {
        char lettersZA = 97;
        for (int i = 122; i > 96; i--) {
            System.out.print(lettersZA= (char) i);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void letters09 () {
        char letters09 = 48;
        for (int i = 48; i <= 57; i++) {
            System.out.print(letters09= (char) i);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        lettersAZ();
        lettersaz();
        lettersZA();
        lettersza();
        letters09();
    }
}


/*
make methods that prints 
    - all the letters from A - Z
    - all the letters from a - z
    - all the letters from Z - A
    - all the letters from z - a
    - all the numbers from 0 - 9

 */