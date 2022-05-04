package day33_methods;

public class Email {
    public static void buildEmail(String name, String domain){
        String email = name.substring(0,1);
        int indexOfSpace = name.indexOf(" ");
        email += name.substring(indexOfSpace+1, indexOfSpace + 4); // given the first three letters of the lastname
        email += "@" + domain.toLowerCase() + ".com";
        System.out.println(email);
    }

    public static void main(String[] args) {

        buildEmail("James Bond", "Gmail");
        buildEmail("Anna Smith", "Yahoo");
    }
}
