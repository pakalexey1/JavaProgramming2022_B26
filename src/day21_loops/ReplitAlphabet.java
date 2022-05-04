package day21_loops;

public class ReplitAlphabet {
    public static void main(String[] args) {

        char ascend = 'A';
        char descend = 'z';

        while (ascend<='Z'){
            System.out.print(ascend++);
        }
        System.out.println();
        while (descend>='a'){
            System.out.print(descend--);
        }

    }
}
