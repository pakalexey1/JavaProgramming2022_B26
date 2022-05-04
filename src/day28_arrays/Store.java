package day28_arrays;

public class Store  {
    public static void main(String[] args) {

        String [] items = {"Shoes", "Jacket", "Gloves", "Airpods","iPad"};
        // Do we have jackets in stock?
        String item = "Jacket";
        int count = 0;
        for (int i = 0; i < 5 ; i++) {
            if (items[i]== item) {
                count++;
            }
        }
        if (count>0){
            System.out.println("Yes we have " + item + " in stock");
        }else{
            System.out.println("Sorry no " + item + " in stock.");
        }
    }
}
