package day57_exceptions.learn;

import java.sql.SQLOutput;

public class FirstTry {
    public static void main(String[] args) {

        System.out.println("Firt Line");
        try{
        String word = "Java";
        System.out.println(word.charAt(100));


        }catch(Exception e){
            System.out.println("Exception happened");
        }

        System.out.println("Last Line");

    }
}
