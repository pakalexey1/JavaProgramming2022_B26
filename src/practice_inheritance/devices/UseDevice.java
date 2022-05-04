package practice_inheritance.devices;

public class UseDevice {
    public static void main(String[] args) {

        TV tv1 = new TV("Sony", "ABC1", 500, true);
//        tv1.brand = "Sony";
//        tv1.model = "ABC1";
//        tv1.price = 500;
//        tv1.isWireless = true;

        tv1.useDevice();
        System.out.println(tv1);

        Phone phone1 = new Phone ("Apple", "Iphone X", 450, false);
        phone1.useDevice();
        System.out.println(phone1);

    }
}

/*
	create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class

	List the is a relations of all the classes
 */