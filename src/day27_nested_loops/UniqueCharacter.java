package day27_nested_loops;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str = "AABCCDEEF";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char letter = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {

                    char innerLetter = str.charAt(j);
                    //System.out.println(letter + " - " + innerLetter );
                    if (letter == innerLetter) {
                        count++;
                    }
            }
            if (count == 1) {
                System.out.print(letter);
            }
        }
    }
}
/*
print unique letters of a string in one line
input: AABCCDEEF
output: BDF

 */