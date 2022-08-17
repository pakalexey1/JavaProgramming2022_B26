package practice_maps;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String str = "I Like java and javascript not python";
        frequencyOfWords(str);
    }
    public static void frequencyOfWords (String str){

        int javaCount = 0;
        int pythonCount = 0;
        String java = "java";
        String python = "python";

        for (int i = 0; i < str.length()-java.length()+1; i++) {
            if (str.substring(i,i+java.length()).equals(java)){
                javaCount++;
            }
        }

        for (int i = 0; i < str.length()-python.length()+1; i++) {
            if (str.substring(i,i+python.length()).equals(python)){
                pythonCount++;
            }
        }
        System.out.println("Java string count = " + javaCount +"\nPyhton string count = " + pythonCount);
    }
}

//    //61
//    write a program that can return the number of appearances of
//        "java" and "python" anywhere in the sentence---"I Like java and javascript not python";
//        You will do for each and regular for loop
//        for each result: java 2
//        python 1