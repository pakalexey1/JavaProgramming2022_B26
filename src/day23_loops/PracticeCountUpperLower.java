package day23_loops;

public class PracticeCountUpperLower {
    public static void main(String[] args) {
        String word = "2juMp41EEkd4s4";
        int upper =0;
        int lower = 0;
        int numb = 0;

        String upperChar ="";
        String lowerChar = "";
        String numbChar = "";

        for(int i = 0; i <= word.length()-1; i++){
            if (word.charAt(i)>=65 && word.charAt(i)<=90){
                upper++;
                upperChar+=word.charAt(i);
            }
            else if (word.charAt(i)>=97 && word.charAt(i)<=122){
                lower++;
                lowerChar+= word.charAt(i);
            }
            else if (word.charAt(i)>=48 && word.charAt(i)<=57) {
                numb++;
                numbChar+= word.charAt(i);
            }

        }
        System.out.println(upper + " uppercase letters");
        System.out.println(upperChar);
        System.out.println(lower + " lowercase letters");
        System.out.println(lowerChar);
        System.out.println(numb + " numbers");
        System.out.println(numbChar);
    }
}
