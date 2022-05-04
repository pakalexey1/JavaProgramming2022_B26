package day05_Variables;

public class ConcatExamples {
    public static void main(String[] args) {

        System.out.println(5+4+"hello"); //due to left to right execution 5+4 will be summed up first, then it will concat "hello"
        System.out.println("hello"+5+4); // due to left to right execution "hello" makes everything a string

    }
}
