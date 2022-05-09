package day55_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {
// All possible objects of TShirt

        TShirt tshirt1 = new TShirt(); // reference of itself
        tshirt1.wear();

        Clothes tshirt2 = new TShirt(); // reference of Parent/Super class

        Object tshirt3 = new TShirt();

        // tshirt3.wear(); Objet class doesn't have reference to the wear() method

        // HasHood tshirt4 = new TShirt(); Tshirt class doesn't implement HasHood interface


        System.out.println();

        Jacket jacket1 = new Jacket();//reference of itself
        jacket1.wear();
        jacket1.putOnHood();

        Clothes jacket2 = new Jacket();// reference of the super class
        jacket2.wear();
        //jacket2.putOnHood();

        Object jacket3 = new Jacket();// reference of super class Object
//        jacket3.wear();
//        jacket3.putOnHood();
        //Object class doesn't have reference to wear() or putOnHood() methods

        HasHood jacket4 = new Jacket();
        //jacket4.wear(); doesn't inherit Clothes method
        jacket4.putOnHood();

        System.out.println("++++++++++++++++++");

        buy(tshirt1);
        buy(jacket1);

    }

    public static void buy(Clothes clothes){
        if(clothes instanceof TShirt){
            System.out.println("Bought TShirt");
        }else if (clothes instanceof Jacket){
            System.out.println("Bought a cool Jacket");
        }

    }

}
