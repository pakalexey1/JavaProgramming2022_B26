package day21_loops;

public class WhileLoopPractice {
    public static void main(String[] args) {

        char letterUp = 'a';
        while (letterUp<='z') {
            System.out.print(letterUp + " ");
            letterUp++;
        }
        System.out.println();

        char letterDown = 'Z';
        while (letterDown >= 'A') {
            System.out.print(letterDown + " ");
            letterDown--;
        }
        System.out.println();
        System.out.println("================");


        char letterDown2 = 'z';
        while (letterDown2>='a'){
            System.out.print(letterDown2+" ");
            letterDown2--;
        }
        System.out.println();
        char letterUp2 = 'A';
        while (letterUp2 <= 'Z') {
            System.out.print(letterUp2 + " ");
            letterUp2++;
        }
        System.out.println();
        System.out.println("================");

        int num = 1;
        int result = 0;
        while (num <= 500) {
            result+=num;
            num++;
        }
        System.out.println(result);

    }
}
