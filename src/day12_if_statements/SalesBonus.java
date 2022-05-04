package day12_if_statements;

public class SalesBonus {
    public static void main(String[] args) {

        int sales = 100000;

        if (sales < 10000) {
            System.out.println("No bonus");
        }else if (sales >=10 && sales<15000) {
            System.out.println(5000);
        } else if (sales>=15000 ){
            System.out.println(7000);
        }


    }
}
