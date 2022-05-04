package day30_arrays;

public class PracticeCharArray {
    public static void main(String[] args) {

        String name = "Hambone";
        char[] nameArr = name.toCharArray();

        System.out.println(nameArr[0] + nameArr[nameArr.length - 1]);
    }
}
/*
Ask the user to enter their first name
Convert the name into a char array
print the first and last letter of the name
 */