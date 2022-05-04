package practice_inheritance.devices;

public class Phone extends Device{

    public Phone(String brand, String model, double price, boolean isWireless) {
        super(brand, model, price, isWireless);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }

    @Override
    public void useDevice(){
        System.out.println("Using " + brand + " " + model + " phone");
    }
}

/*
Create a class called Phone:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using Phone
 */