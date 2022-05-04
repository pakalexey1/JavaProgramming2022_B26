package day06_RecapOfDay05;

public class AddSubtractDivideMulti {
    public static void main(String[] args) {

        byte b1=10;
        byte b2=20;

        // byte sum = b1+b2; this will not work because the values get changed into int during calculation. This is just how Java works - it still converts smaller types into int

        int sum = b1+b2;
        byte sumByte = (byte) (b1 + b2);
        System.out.println(sum);
        System.out.println(sumByte);



    }
}

