package day26_nested_loops;

public class NestedLoopExample2 {
    public static void main(String[] args) {

        for (int i=0; i < 5; i++){
            System.out.print("A" +  i);

            for (int b = 0; b < i; b++){
                System.out.print("B" + b);
            }
            System.out.println();
        }


        System.out.println("==============================");
        String s = "java";

        for (int i = 0; i < s.length(); i++){
            for (int b = 0; b <= i; b++){
                System.out.print(s.charAt(b));
            }
            System.out.println();
        }

    }
}
