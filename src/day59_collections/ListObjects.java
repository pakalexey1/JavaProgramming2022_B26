package day59_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListObjects {
    public static void main(String[] args) {

        List<String> newList = new ArrayList<>();//reference of the interface list but the object is ArrayList
        newList.add("a");
        newList.add("b");
        newList.add("c");
        newList.add("d");
        newList.add(null);
        newList.add("a");
        System.out.println(newList);
        System.out.println(newList.get(3));

        List<String> newList2 = new LinkedList<>();// reference of the interface List, but the object is LInkedList
        // object
        newList2.add("a");
        newList2.add("b");
        newList2.add("c");
        newList2.add("d");
        newList2.add(null);
        newList2.add("a");
        System.out.println(newList2);
        System.out.println(newList2.get(3));

        List<String> newList3 = new LinkedList<>();// reference of the interface List, but the object is LInkedList
        // object
        newList3.add("a");
        newList3.add("b");
        newList3.add("c");
        newList3.add("d");
        newList3.add(null);
        newList3.add("a");
        System.out.println(newList3);
        System.out.println(newList3.get(3));


    }
}
