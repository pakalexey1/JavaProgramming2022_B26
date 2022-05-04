package day07_Unary_Operators;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 0;
        /*System.out.println(x);
        x++;
        System.out.println(x);
        */
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x++);

        System.out.println("===============================");
        int age = 20;
        System.out.println(age); // 20
        System.out.println(age++); // 20
        System.out.println(age); // 21

        System.out.println(age++); // 21
        System.out.println(age); // 22

        System.out.println(++age); // 23

        System.out.println("========================");

        int i = 5;// 5
        int z = i++;// 5

        System.out.println(i);
        System.out.println(z); // when i was assigned to z it was 5, that's why the output is 5

        System.out.println("========================");

        int p = 0;
        System.out.println(p); // 0
        p = p+1;
        System.out.println(p); // 1
        p++;
        System.out.println(p); // 2


    }
}
