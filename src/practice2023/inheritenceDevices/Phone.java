package practice2023.inheritenceDevices;

public class Phone extends Device{

    public Phone(String brand, String model, double price, boolean wireless){
        super(brand,model,price,wireless);
    }

    @Override
    public void usingDevice(){
        System.out.println("Using " + getBrand() + " " + model + " phone");
    }

    @Override
    public String toString(){
        return "Phone{" +
                "brand = '" + getBrand() + '\''+
                ", model = '" + model + '\'' +
                ", price = " + getPrice() +
                ", isWireless = " + isWireless +
                '}';
    }




}

/*
Create a class called Phone:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using Phone
 */