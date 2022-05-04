package day23_loops;

import java.util.Random;

public class PracticeRandomNumbers {
    public static void main(String[] args) {

        Random output = new Random();
        String finalNum = "";

        for (int i = 0; i <= 5; i++) {
            if (!finalNum.contains(""+output.nextInt(9))){
                finalNum+=output+" ";
            }else {
                continue;
            }

        }
        System.out.println(finalNum);

    }
}
