package day34_methods;

public class voidVsReturn {

    public static void main(String[] args) {
        sayHello();;
        // String msg = sayHello(); won't work because the method is void

        sayBye();
        System.out.println(sayBye());
        String msg = sayBye();
        System.out.println(msg);

    }

    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String sayBye(){

        return  "Bye";
    }


}
