package day60_collections;

import java.util.*;

public class SetsVsList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        System.out.println(list);
        System.out.println("first " + list.get(0));
        System.out.println("last " + list.get(list.size() - 1));


        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);
        set.add(4);
        System.out.println(set);
//        System.out.println("first " + set.get(0));
//        System.out.println("last " + set.get(set.size()-1));
        // set does not have indexes

        //because set does not have indexes we can use a loop to go through the elements
        for (int each : set) {
            System.out.println(each);
        }

        //sort my HashSet
        System.out.println(new TreeSet<>(set));

        //converting list to set. Maintains insertion order
        System.out.println(new LinkedHashSet<>(list));

        System.out.println(new HashSet<>(Arrays.asList(1, 5, 2, 1, 4, 2, 5, 1))); // asList method returns List type,
        // which can have teh reference of the Collection interface, so we are able to make an object of HashSet with
        // these initial values

        String s = "aaabbbcccddddeee";
        System.out.println(new HashSet<>(Arrays.asList(s.split("")))
                .toString()
                .replace(", ","")
                .replace("[","")
                .replace("]",""));

        /*
        above we convert the String s to an array
        that array is the argument of teh Arrays.asList method()
        that array is converted to as List type which is allowed in the HashSet constructor because List is a
        Collection and Collection si the parameter type
        Then we converted the Hashset - which removed the duplicated, to a String and did String manipulation
         */
    }
}
