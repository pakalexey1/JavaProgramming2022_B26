package classes_self_review.carpet;

public class Carpet {
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet(double width, double length, boolean isPersian, double unitPrice) {
        this.width = width;
        this.length = length;
        this.isPersian = isPersian;
        this.unitPrice = unitPrice;
        calculatePrice();
    }


    public void calculatePrice(){
        totalPrice = width * length * unitPrice;

        if (isPersian){
            totalPrice+=200;
        }
    }

    public String toString(){
        return (isPersian ? "The Persian Carpet" : "The Carpet") + "\nhas dimenstions of " + length +" x " + width +
                "\nThe unit price is $" + unitPrice + "\nAll coming to a total of: $" + totalPrice;
    }


}
