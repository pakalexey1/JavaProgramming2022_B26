package day33_methods;

public class LastCharacters2D {
    public static void main(String[] args) {

        String[][] words = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
            };
    for(String[] eachArrayElement : words) {

        for (String eachWordOfInnerArray : eachArrayElement){
            System.out.print(eachWordOfInnerArray.charAt(eachWordOfInnerArray.length() - 1)); // prints last character of each word
        }
        System.out.println(); // creates an empty line after each array
    }

    }
}
