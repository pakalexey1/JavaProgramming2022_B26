package day43_custom_classes;

public class Carpet {
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet (double carpetWidth, double carpetLength, boolean carpetPersian, double carpetPrice){

        width = carpetWidth;
        length = carpetLength;
        isPersian = carpetPersian;
        unitPrice = carpetPrice;
        calculatePrice();

    }

    public void calculatePrice(){
        totalPrice = width * length * unitPrice;

        if (isPersian){
            totalPrice += 200;
        }
    }

    public String toString(){
        return  (isPersian ? "The Persion Carpet" : "The Carpet") +
                "\nhas dimensions of  " + length + " x " + width +
                "\nThe unit price is $" + unitPrice +
                "\nAll coming to a total of: $" + totalPrice;
    }

}
