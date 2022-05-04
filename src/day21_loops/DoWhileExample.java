package day21_loops;

public class DoWhileExample {
    public static void main(String[] args) {

        int a = 0;

        do{
            // everything between the curly brackets are in the loop
            System.out.println(a);
            a++;

        } while (a < 10);


        // this loop has a boolean as false but it will run it once, because boolean is in the end
        System.out.println("With False boolean: ");

        int a2 = 0;

        do {
            // everything between the curly brackets are in the loop
            System.out.println(a2);
            a2++;
        } while (a2 == 10);

        System.out.println("as while loop:");
        int a3 =0;
        while(a3 == 10){
        System.out.println(a3);
        a3++;
        }
    }
}
