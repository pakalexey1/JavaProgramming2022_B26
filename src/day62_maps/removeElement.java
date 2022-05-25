package day62_maps;

import java.lang.reflect.Array;
import java.util.*;

public class removeElement {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed","Vika","Alex","Sasha","Ahmed"));
        System.out.println(removeName5());
    }

    public static ArrayList<String> removeName(ArrayList<String> names) {
//        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed","Vika","Alex","Sasha","Ahmed"));
        for (int i = 0; i < names.size(); i++) {
            names.removeIf(eachName -> eachName.equals("Ahmed"));
        }

        return names;
    }

    public static ArrayList<String> removeNames2(ArrayList<String> names){

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            if (it.next().equals("Ahmed")){
                it.remove();
            }
        }

        return names;
    }

    public static ArrayList<String> removeName3(ArrayList<String> names){
        ArrayList<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        int count = 0;
        for(String s: names){
            if (map.containsKey(s)){
                count = map.get(s);
                count++;
                map.put(s,count);
            }else{
                map.put(s,1);
            }
        }
        map.remove("Ahmed");
        for (String s : map.keySet()){
            list.add(s);
        }

        return list;
    }

    public static ArrayList<String> removeName4 (ArrayList<String> names){

        ArrayList <String> output = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            if (!names.get(i).equals("Ahmed")){
                output.add(names.get(i));
            }
        }
        return output;
    }

    public static Queue<String> removeName5 (){
        Queue<String>names = new LinkedList<>();
        names.add("Ahmed");
        names.add("Vika");
        names.add("Sasha");
        names.add("Alex");



        names.poll();
        return names;
    }
}

/*
Given an ArrayList of names, remove all the names that are 'Ahmed'
- Think about how many different ways you can do this
 */