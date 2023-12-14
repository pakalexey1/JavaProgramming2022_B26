package practice_inheritance.devices;

public class TV extends Device {

    public TV (String brand, String model, double price, boolean isWireless){
        super(brand, model, price, isWireless);
}

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }

    @Override
    public void useDevice(){
        System.out.println("Using " + brand + model + " TV");
    }

}

/*

Create a class called TV:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using TV

 */
