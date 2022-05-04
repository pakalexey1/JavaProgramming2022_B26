package day22_loops;

public class EncryptPassword {
    public static void main(String[] args) {

        String pass = "cydeo";
        String output = "";

        for (int i = 0; i < pass.length(); i++) {
            output += pass.charAt(i) + "x";
        }
        System.out.println(output);

    }
}

/*
Given a string password. Encrypt with "x" a given password and print.
               * password: cydeo
               * encrypt with char :x
               * output:cxyxdxexox
 */