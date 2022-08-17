package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveAhmed {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeAhmed(names));
    }
    public static ArrayList<String> removeAhmed(ArrayList<String> names){

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            if (it.next().equals("Ahmed")){
                it.remove();
            }
        }
        return names;
    }
}



//24  USE ITERATOR
//ArrayList -- Remove "Ahmed"
//        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed".));
