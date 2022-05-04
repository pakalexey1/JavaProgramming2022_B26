package day20_string;

public class AreRelated {
    public static void main(String[] args) {

        String name1 = "James Bond";
        String name2 = "Jamie Benji";

        boolean areRelated = name1.substring(name1.indexOf(" ")+1).equals(name2.substring(name2.indexOf(" ")+1));
        System.out.println(areRelated);

    }
}
