package day24_loops;

public class ReplitCountJavaPython {
    public static void main(String[] args) {

        String sentence = "What's the difference between java, javascript and python?";
        int countJava = 0;
        int countPython = 0;

        for (int i = 0; i < sentence.length()-2; i++) {
            if (sentence.substring(i,i+3).equalsIgnoreCase("cat")){
                countJava++;
            }
        }
        for (int i = 0; i < sentence.length()-2; i++) {
            if (sentence.substring(i,i+3).equalsIgnoreCase("dog")){
                countPython++;
            }
        }
        System.out.println(countPython==countJava);


    }
}
