package codingBatWarmup1;

public class diff21 {

    public static void main(String[] args) {
        System.out.println(diff21(-1));
    }

    public static int diff21 (int n){
        if (n>=21){
            return (21-n)*2;
        }else if (n>=0 && n <21 ){
            return 21 - n;
        }
        else {
            return 21-(n*(-1));
        }

    }

}
/*

Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */