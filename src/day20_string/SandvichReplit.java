package day20_string;

public class SandvichReplit {
    public static void main(String[] args) {

        String str = "xxxbreadhambread";

        int first = str.indexOf("bread")+5;
        int last = str.lastIndexOf("bread");
        System.out.println(first);
        System.out.println(last);

        if (first>last) {
            System.out.println(str.substring(first, last));
        }else {
            System.out.println("nothing");
        }


    }
}
