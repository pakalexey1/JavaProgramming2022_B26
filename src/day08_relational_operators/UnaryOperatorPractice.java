package day08_relational_operators;

public class UnaryOperatorPractice {
    public static void main(String[] args) {

        int h = 5;
        int p = h;
        
        h++;

        System.out.println("h = " + h);
        System.out.println("p = " + p);
        
        int k = h++;

        System.out.println("h = " + h);
        System.out.println("k = " + k);
        
        int g = ++h;

        System.out.println("h = " + h);
        System.out.println("g = " + g);


        

    }
}
