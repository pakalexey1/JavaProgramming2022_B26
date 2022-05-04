package day05_Variables;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 40;
        int i = b; // the byte value is automatically converted to int, because byte is smaller than int

        int i2=100;
        byte b2=(byte) i2; // in is bigger than byte, so we must cast. We cast the int type - i2 to a byte type using (byte)

        int i3=500;
        long l1=i3; // int is smaller than long, so it will automatically cast

        long l2 = 200; // int is a default value for compiler, so that's why no need to cast here
        int i4= (int) l2; // l2 is a long, so it needs to be cast explicitly. Doesn't matter that 200 above is considered an integer.

        long l3 = 100000;
        byte b3 = (byte) l3; // can't convert probably because the number is too large for byte

        double d = 50.92123;
        int i5=(int) d;
        System.out.println(i5);

    }
}
