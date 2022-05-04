package day37_wrapper_arraylist;

public class ValueVsParse {
    public static void main(String[] args) {

        String s ="30";

        int seconds = Integer.parseInt(s); // converts the "30" String into an int of 30 as a primitive value

        Integer i = Integer.valueOf(s);//converts String into the Integer wrapper class object. The functionality the same to parse, but the data type is different

        int i2 = Integer.valueOf(s);
        /* converts "30" string into the Integer wrapper class object,
        then I am trying to store the value into a primitive variable

        primitive = object type [ unboxing ] is done automatically
        conversion between object type and primitive comes automatically
        */



    }
}
