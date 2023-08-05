package practice_string_and_primitives;

public class ReverseStringDiffMethods {
    public static void main(String[] args) {

        String str = "abcde";
        System.out.println(reverseStringBuilBuff(str));

    }

    public static String reverseStringBuilBuff(String str) {
        //StringBuilder and StringBuffer function the same way
        StringBuilder sb = new StringBuilder(str);
//        String res = sb.reverse().toString();

        StringBuffer sBuffer = new StringBuffer(str);
        String res = sBuffer.reverse().toString();

        return res;
    }

    public static String reverseStringArr(String str){
        String []strArr = str.split("");
        String res ="";
        for (int i = strArr.length; i >= 0 ; i--) {
            res+=strArr;
        }
        return res;
    }
}
