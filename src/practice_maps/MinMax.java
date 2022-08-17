package practice_maps;

import java.util.HashMap;
import java.util.Map;

public class MinMax {
    public static void main(String[] args) {

        Map<String, Integer> t = new HashMap<>();
        t.put("a", 2);
        t.put("q", 5);
        t.put("w", 1);
        minMax(t);

    }

    public static void minMax(Map<String, Integer> map) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue() > maxValue) {
                maxValue = each.getValue();
            }
        }
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue() < minValue) {
                minValue = each.getValue();
            }
        }

        System.out.println("Max value is " + maxValue + "\nMin values is " + minValue);
    }
}
/*
Map -- Min value  and Max value
   Map<String,Integer>t=new HashMap<>();
t.put("a",2);
t.put("q",5);
t.put("w",1);

 */