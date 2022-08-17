package practice_array_arraylist;

public class CountJavaAndPython {
    public static void main(String[] args) {
        String str = "I Like java and javascript not python";
        countJavaAndPython(str);
    }

    public static void countJavaAndPython(String str) {
        int java = 0;
        int python = 0;
        str = str.toLowerCase();

        String[] stringArr = str.split(" ");
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].toLowerCase().contains("java")) {
                java++;
            }
            if (stringArr[i].toLowerCase().contains("python")) {
                python++;
            }
        }
        System.out.println("Java = " + java + "\nPython: " + python);
    }

}
/*
    //61
    write a program that can return the number of appearances of
        "java" and "python" anywhere in the sentence---"I Like java and javascript not python";
        You will do for each and regular for loop
        for each result: java 2
        python 1

 */