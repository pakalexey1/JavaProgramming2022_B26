package practice2023.inheritenceDevices;

public class UsingDevice {
    public static void main(String[] args) {

        Phone phone = new Phone("Samsung", "X", 1230, true);
        phone.usingDevice();
        System.out.println(phone);

        TV tv = new TV("LG", "Super 7", 1111, false );
        tv.usingDevice();
        System.out.println(tv);
    }



}


/*
	create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class

	List the is a relations of all the classes
 */