package day24_loops;
public class CountJava {
    public static void main(String[] args) {
        String str = "java is a language java";
        String wordCompare = "java";
        int count = 0;

        for (int i = 0; i <= str.length()-4; i++) {
            if (str.substring(i,i+4).equalsIgnoreCase(wordCompare)){
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
java is a language

count number of times java is seen
 */