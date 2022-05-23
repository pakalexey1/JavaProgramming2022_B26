package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class HasMapObject {
    public static void main(String[] args) {
        //keys are Integer type, and the values are String type
        Map<Integer, String> map = new HashMap<>();
        //ad key/value to the map
        map.put(1, "one");
        map.put(3, "three");
        map.put(10, "ten");
        map.put(5, "five");

        System.out.println(map); // HashMpa element order is random, not insertion order, not sorted

        //read the key/value from map
        System.out.println(map.get(10));// argument is the key, not index

        String value = map.get(5);
        System.out.println(value);

        map.remove(1);
        System.out.println(map);

        System.out.println(map.containsKey(1)); // false, because entry with key "1" has been removed
        System.out.println(map.containsKey(3)); // true

        System.out.println(map.containsValue("five")); // true
        System.out.println(map.containsValue("10")); // false, the method is checking the value, not the key

        map.put(null,null);
        System.out.println(map);

        map.put(null,"hello world"); // null key exists, so the value get updated to hello world
        System.out.println(map);

        map.put(3, "March");// 3 key exists, the value gets updated to March
        System.out.println(map);

        map.put (7, "March"); // created a 7-March entry with key = 7 and value = March
        System.out.println(map);
    }
}
