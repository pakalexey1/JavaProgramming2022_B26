package practice2023.inheritenceDevices;

public class TV extends Device{

    public TV(String brand, String model, double price, boolean isWireless){
        super(brand, model, price, isWireless);
    }

    @Override
    public void usingDevice(){
        System.out.println("Using " + getBrand() + " " + model + " TV");
    }

    public String toString(){
        return "TV{"+
                ", brand='"+getBrand()+'\''+
                ", model='"+model+'\''+
                ", price="+getPrice()+
                ", isWireless="+isWireless+
                '}';
    }
}

/*
Create a class called TV:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using TV

 */