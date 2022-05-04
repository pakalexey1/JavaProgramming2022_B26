package day47_encapsulation;

public class UseLogin {
    public static void main(String[] args) {
        Login obj = new Login();
//        obj.username = "jamesbond";
//        obj.password = "1234";

        obj.setUsername("jamesbond");
        obj.setPassword("1234");

        // System.out.println(obj.username); not accessible as it's private

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

        obj.setPassword("james007password");
        System.out.println(obj.getPassword());
    }
}
