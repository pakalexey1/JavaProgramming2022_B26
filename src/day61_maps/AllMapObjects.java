package day61_maps;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {

        Map<String, String> mapOne = new HashMap<>(); // no guaranteed order
        mapOne.put("saim","java");
        mapOne.put("hello","world");
        mapOne.put("james","bond");
        mapOne.put("aysun","UI testing");
        mapOne.put("nadir","soft skills");
        mapOne.put("username","password");
        mapOne.put(null,"nothing");
        System.out.println(mapOne);

        System.out.println("====================");

        Map<String, String> linkedMap = new LinkedHashMap<>(); // insertion order is mainatined
        linkedMap.put("saim","java");
        linkedMap.put("hello","world");
        linkedMap.put("james","bond");
        linkedMap.put("aysun","UI testing");
        linkedMap.put("nadir","soft skills");
        linkedMap.put("username","password");
        linkedMap.put(null,"nothing");
        System.out.println(linkedMap);

        System.out.println("==================");

        Map<String, String> treeMap = new TreeMap<>(); // natural order maintained - alphabetical ascending order
        treeMap.put("saim","java");
        treeMap.put("hello","world");
        treeMap.put("james","bond");
        treeMap.put("aysun","UI testing");
        treeMap.put("nadir","soft skills");
        treeMap.put("username","password");
        //treeMap.put(null,"nothing"); // TreeMap object's don't accept null as key
        System.out.println(treeMap);

        System.out.println("==================");

        Map<String, String> hashTable = new Hashtable<>(); //
        hashTable.put("saim","java");
        hashTable.put("hello","world");
        hashTable.put("james","bond");
        hashTable.put("aysun","UI testing");
        hashTable.put("nadir","soft skills");
        hashTable.put("username","password");
        //hashTable.put(null,"nothing"); // hashTable object's don't accept null as key
        System.out.println(hashTable);
    }
}
