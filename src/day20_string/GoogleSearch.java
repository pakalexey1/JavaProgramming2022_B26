package day20_string;

public class GoogleSearch {
    public static void main(String[] args) {

        String search = "About 3,640,000,000 results (0.78 seconds)";

        String numberOfResults = search.substring(search.indexOf(" ") + 1, search.indexOf("r"));
        String responseTime = search.substring(search.indexOf("(")+1, search.indexOf(")"));
        System.out.println("Result number is " + numberOfResults);
        System.out.println("Response time is " + responseTime);


    }
}
