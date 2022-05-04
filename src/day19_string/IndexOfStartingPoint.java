package day19_string;

public class IndexOfStartingPoint {
    public static void main(String[] args) {

        String word = "definition";
        //             0123456789

        System.out.println("first i: "+word.indexOf("i"));
        System.out.println("last i: "+word.lastIndexOf("i"));

        System.out.println("second i: "+word.indexOf('i',4)); // 4 is a starting point from which it will start looking
        System.out.println("third i: "+word.indexOf('i', 6));

    }
}
