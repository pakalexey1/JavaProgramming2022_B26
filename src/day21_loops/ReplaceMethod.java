package day21_loops;

public class ReplaceMethod {
    public static void main(String[] args) {

        String s = "java is a language";
        s = s.replace ("a", "ъ" );
        System.out.println(s);

        String day = "Today is monday";
        day = day.replace("monday","tuesday");
        System.out.println(day);

    }
}
