package day59_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add("Hello");
        set.add("$4.3");
        set.add("400");
        set.add("Hello");
        set.add("%");
        System.out.println(set);

        Set<String> set2 = new LinkedHashSet<>();
        set2.add(null);
        set2.add("Hello");
        set2.add("$4.3");
        set2.add("400");
        set2.add("Hello"); // nothing is changed, duplicate not allowed
        set2.add("%");
        set2.add("400"); // nothing is changed, duplicate not allowed
        System.out.println(set2);

        Set<String> set3 = new TreeSet<>();
        //set3.add(null); null not allowed
        set3.add("Hello");
        set3.add("$4.3");
        set3.add("400");
        set3.add("Hello");
        set3.add("%");
        System.out.println(set3);


    }
}
