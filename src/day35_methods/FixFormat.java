package day35_methods;

public class FixFormat {
    public static String fixFormat (String str){
        str = str.trim();
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
}


/*
Fix Format

create a method that will accept a String and return a String in proper format. Proper format is:
First char starting as uppercase and the rest as lowercase

ex:
    input:
         jamES

    output:
         James
 */