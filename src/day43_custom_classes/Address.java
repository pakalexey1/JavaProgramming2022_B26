package day43_custom_classes;

public class Address {

    String street;
    String city;
    String state;
    String zipCode;

//    public Address (String inputStreet, String inputCity, String inputState, String inputZipCode){
//        street = inputStreet;
//        city = inputCity;
//        state = inputState;
//        zipCode = inputZipCode;
//    }

    public Address (String inputStreet, String inputCity, String inputState, String inputZipCode){
        this.street = street; // assigning the value of the local street from the parameters to the instance variable street
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

}
