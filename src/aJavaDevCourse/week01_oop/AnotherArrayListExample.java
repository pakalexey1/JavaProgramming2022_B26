package aJavaDevCourse.week01_oop;

import java.util.ArrayList;

public class AnotherArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Java");


        printRawTypeList(names);
//        printWildcardList(names);
    }

    public static void printRawTypeList(ArrayList rawType){
        for (Object obj: rawType){
            System.out.println(obj);
        }

        rawType.add(101);
        rawType.add("101");
        rawType.add(121.00);
    }

    public static void printWildCard(ArrayList<?> unbounded){
        for (Object obj: unbounded){
            System.out.println(obj);
        }
//        unbounded.add(101);
//        unbounded.add("101");
//        unbounded.add(121.00);
    }
}
