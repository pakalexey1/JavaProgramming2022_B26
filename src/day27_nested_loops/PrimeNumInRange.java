package day27_nested_loops;

public class PrimeNumInRange {
    public static void main(String[] args) {

        int range = 50;

        for (int i = 2;  i <=range; i++) {

            int count = 0; // putting the counter inside the outer loop will reset it back to 0 for the next number
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    //System.out.println("prime: " + i +"/" + j + " = " + i%j + " ");
                    count++;
                }else{
                    //System.out.println("not prime: " + i +"/" + j + " = " + i%j);
                }
            }
            if (count == 0){
                System.out.print(i + ", ");
            }
        }

    }
}

/*
find all prime numbers in a range and print them in one row
 */