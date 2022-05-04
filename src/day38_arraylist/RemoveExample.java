package day38_arraylist;

import java.sql.Array;
import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("water");
        list.add("earth");
        list.add("fire");
        list.add("wind");
        System.out.println(list); //[water, earth, fire, wind]

        list.remove(0); //returns: water, but we didn't use it
        System.out.println(list);// [earth, fire, wind]
        System.out.println(list.remove(list.size()-1));//wind
        System.out.println(list);

        list.remove("fire");
        System.out.println(list);//[earth]

        System.out.println(list.remove("apple")); // returns false, because there is no such element in the ArrayList
        System.out.println(list);//[earth]

    }
}
