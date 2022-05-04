package day29_arrays;

public class ArrayIndexExample {
    public static void main(String[] args) {
        String [] items = {"Shoes", "Jackets", "Gloves", "AirPod", "iPod", "Backpack"};
        double [] prices = {89.99, 150.0, 999.99, 250.0, 439.5, 39.99};
        int [] itemIDs = {12345, 12346, 12347, 12348, 12349};

        double mostExpemsive = 0;
        int indexOfMostExp = 0;

        for (int i = 0; i < items.length; i++) {

            if (items[i]=="Gloves"){
                System.out.println("Gloves index: " + i);
            }

        }
        for (int i = 0; i < items.length; i++) {

            if (prices[i]>mostExpemsive){
                mostExpemsive=prices[i];
                indexOfMostExp = i;
            }
        }
        System.out.println(items[indexOfMostExp]);
        System.out.println(prices[indexOfMostExp]);
        System.out.println(itemIDs[indexOfMostExp]);
    }
}
