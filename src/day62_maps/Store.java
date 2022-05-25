package day62_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Map<String, Double> store = new HashMap<>();
        store.put("Water", 1.5);
        store.put("Coffee", 2.5);
        store.put("Apples", 0.99);
        store.put("Bread", 2.35);
        store.put("Cucumbers", 1.5);

        System.out.println("Store Inventory");

//        for (String key : store.keySet()) { // returns the set of keys, then we use those keys to get values
//        related to those keys
//            System.out.println("\tItem: " + key + " for $" + store.get(key));
//        }

        for(Map.Entry<String, Double> eachElement : store.entrySet()){ // returns the entry (key/value pairs) from
            // the map
            System.out.println("\ttItem: " + eachElement.getKey() + " for $" + eachElement.getValue());
        }

        System.out.println(store.values());// returns the values from map as a collection type

        Scanner input = new Scanner(System.in);
        System.out.println("What item do you want?");
        String item = input.nextLine();
        System.out.println(store.containsKey(item)? item + " is in stock $" + store.get(item) : "Not available in this store");
    }
}
