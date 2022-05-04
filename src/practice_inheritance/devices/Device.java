package practice_inheritance.devices;

public class Device {
    String brand;
    String model;
    double price;
    boolean isWireless;

    public Device (String brand, String model, double price, boolean isWireless){
       this.brand = brand;
       this.model = model;
       this.price = price;
       this.isWireless = isWireless;
    }

    public void useDevice(){
        System.out.println("Using " + brand + " " + model);
    }

    @Override
    public String toString() {
        return "CreateDevice{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }
}


/*
Create a class called device:
- attributes: brand, model, price, wireless
- methods: toString(), useDevice()
 */