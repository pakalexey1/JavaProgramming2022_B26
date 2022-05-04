package day43_custom_classes;

public class Phone {

    String model;
    String brand;
    int memory;
    double softwareVersion;

    public Phone(String inputModel) {
        model = inputModel;
    }


    public Phone(String inputModel, String inputBrand) {
        model = inputModel;
        brand = inputBrand;
    }

    public Phone(String model, String brand, int memory, double softwareVersion) {
        this.model = model;
        this.brand = brand;
        this.memory = memory;
        this.softwareVersion = softwareVersion;
    }

    public String toString(){
        String obj = model;

        if(brand != null){
            obj += " | " + brand;
        }
        if (memory!=0){
            obj += " | " + memory ;
        }
        if (softwareVersion!=0.0){
            obj += " | " + softwareVersion;
        }
        return obj;
    }

//    @Override
//    public String toString() {
//        return "Phone{" +
//                "model='" + model + '\'' +
//                ", brand='" + brand + '\'' +
//                ", memory=" + memory +
//                ", softwareVersion='" + softwareVersion + '\'' +
//                '}';
//    }

}

    /*

        create instance variables

            name, brand, memory, softare version

         create constructors
         - accept and initialize the model
         - accept and initailzie the model and brand
         - accept and initialize the model, brand, memory and version

         create to string

     */