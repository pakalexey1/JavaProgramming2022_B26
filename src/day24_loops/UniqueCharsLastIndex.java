package day24_loops;

public class UniqueCharsLastIndex {
    public static void main(String[] args) {

        String str = "Saeeda";
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            int num = str.indexOf(letter);
            int num1 = str.lastIndexOf(letter);
            boolean isUnique = num == num1;
            if (isUnique){
                System.out.print(letter);
            }

        }
    }
}
