package day24_loops;
public class CountJava2 {
    public static void main(String[] args) {
        String str = "java is a java language.java";
        int count = 0;

        while (str.contains("java")){
            str = str.replaceFirst("java","*");
            System.out.println(str);
            count++;
        }
        System.out.println(count);
        System.out.println(str);
    }
}
