package day17_string;

public class StringMemory {
    public static void main(String[] args) {

        String first = "java"; //String literal, being saved in String pool

        String second = new String ("java"); // String object, being saved not in String pool, but directly in the heap

        String third = "java";
        System.out.println(first==third); // they both point to the same object in String pool, hence they are equal

        String fourth = "Java";
        System.out.println(first==fourth); // fourth is a new object in String pool, because it starts with Capital "J" so it's not equal to first

        String fifth = new String ("java");

        System.out.println(second==fifth);// objects in heap are not equal to each other even if they spelled the same way

    }
}
