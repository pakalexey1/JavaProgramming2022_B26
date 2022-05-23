package day61_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemovingWhileLooping {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                1, 4, 5, 52, 5, 23, 3, 5, 25, 4, 5, 1, 2
        ));

        // traditional loop with removing doesn't, but because indexes/ elements get shifted so it would miss some of
        // the elements that meet criteria.
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i)<5){
//                list.remove(i);
//            }
//        }

        // removing in a for each loop is also not valid because we cannot change the size of the
        // arraylist/collection when looping in for each loop
//        for(int each : list){
//            if (each < 5){
//                list.remove(each);
//            }
//        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) { // checks if there is an element next tot it
            if (it.next() < 6) { //move the pin to the next element and then return it
                it.remove(); // remove the element from the list at which the pin is pointing
            }
        }
        System.out.println(list);


    }
}
