package practice_string_and_primitives;

public class stringBuffer {
    public static void main(String[] args) {

        System.out.println(reverseInt(-123));
    }
    public static int reverseInt(int a) {

    StringBuilder stringBuffer = new StringBuilder();
    int b = Math.abs(a);
    String bStr = String.valueOf(b);
        for (int i = bStr.length()-1; i >= 0; i--) {
            stringBuffer.append(bStr.charAt(i));
        }

        if (a<0) {
            return Integer.parseInt(String.valueOf(stringBuffer)) * (-1);
        }else{
            return Integer.parseInt(String.valueOf(stringBuffer));
        }
    }
}


//42  reverse   USE STRINGBUFFER
//int num = -123;
//-321