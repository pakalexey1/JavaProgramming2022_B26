package practice_maps;

import java.util.Map;

public class mapBully {
    public static Map<String,String> mapBully (Map<String,String>myMap){

        if (myMap.containsKey("a")){
            myMap.put("b",myMap.get("a"));
            myMap.put("a","");
        }
        return myMap;

    }

}

/*

Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.


mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */
