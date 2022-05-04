package day22_loops;

public class ReplitFactorial {
    public static void main(String[] args) {

        int n = 8;
        int i = 1;
        int result =1;
        while (i<n){
            i++;
            result*=i;
        }
        System.out.println(result);
    }
}
