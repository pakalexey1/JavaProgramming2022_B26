package classes_self_review.day55_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {

        Tshirt tshirt1 = new Tshirt();
        tshirt1.wear();

        Clothes tshirt2 = new Tshirt();
        tshirt2.wear();

        Object tshirt3 = new Tshirt();
//        tshirt3.wear(); Object class is the parent of Clothes class, so it doesn't know the wear() method

//        HasHood tshirt4 = new Tshirt(); Tshirt class does not implment HasHood interface


        Jacket jacket1 = new Jacket();
        jacket1.wear();
        jacket1.putOnHood();

        Clothes jacket2 = new Jacket();
        jacket2.wear();
//        jacket2.putOnHood(); Clothes class doesn't implement HasHood interface

        HasHood jacket4 = new Jacket();
//        jacket4.wear(); doesn't inherit Clothes class
        jacket4.putOnHood();


        System.out.println("+++++++++++++++++++");
        buy(tshirt1);
        buy(jacket1);
        buy(new Tshirt());
        buy(new Jacket());
    }

    public static void buy(Clothes clothes) { // this is a more usable method, because it can work both with Tshirt and Jacket
        if (clothes instanceof Tshirt) {
            System.out.println("Bought a TShirt");
        } else if (clothes instanceof Jacket) {
            System.out.println("Bought a Jacket");
        }
    }
//    public static void buy (Tshirt tshirt){
//
//    }
//    public static void buy (Jacket jacket){
//
//    }

}
