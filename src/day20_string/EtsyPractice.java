package day20_string;

public class EtsyPractice {
    public static void main(String[] args) {
        String input = "https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049";
        String output = input.substring(input.indexOf("/c/")+3,input.indexOf("/toys/"));
        System.out.println("Main category name is: "+output.replace("-"," "));

        String input2 = "https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049";
        String output2 = input2.substring(input2.indexOf("/c/")+3,input2.indexOf("?"));
        System.out.println("Main category name is: "+output2.replace("-"," "));
    }
}
