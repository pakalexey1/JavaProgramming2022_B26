package practice2023.inheritenceDevices;

public class Device {
    private String brand;
    String model;
    private double price;
    boolean isWireless;

    public Device(){

    }
    public Device(String brand, String model, Double price, Boolean isWireless){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.isWireless=isWireless;
    }

    public void printDevice(){
        System.out.println("Printing a device");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }


    public void usingDevice(){
        System.out.println("Using device: " + brand + " " + model);
    }
    public String toString(){
        return "Create device {" +
                ", brand='"+brand+'\''+
                ", model='"+model+'\''+
                ", price='"+price+'\''+
                ", It is wireless='"+isWireless+
                '}';
    }
}



/*
Create a class called device:
- attributes: brand, model, price, wireless
- methods: toString(), useDevice()
 */