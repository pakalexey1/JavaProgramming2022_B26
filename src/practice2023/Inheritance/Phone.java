package practice2023.Inheritance;

import java.math.BigDecimal;

public class Phone extends Device{

    public String brand;
    public BigDecimal price;

    public void ring(){
        System.out.println(brand + " is ringing");
    }

    public static void main(String[] args) {

    }
}
