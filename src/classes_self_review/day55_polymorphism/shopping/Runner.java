package classes_self_review.day55_polymorphism.shopping;

public class Runner {
/*
Shopping and OnlineShopping are abstract classes, so we can't make objects of them

Shipping is an interface so can't make an object of it

 */
public static void main(String[] args) {

    Target target = new Target();
    target.price = 10;
    System.out.println(target.price);
    target.buyItem();
    target.returnItem();
//    target.payForShipping(true); Target class does not impement the Shipping interface

    Amazon amazon = new Amazon();
    amazon.price = 10000;
    System.out.println(amazon.price);
    amazon.buyItem();
    amazon.returnItem();
    amazon.payForShipping(true);
    amazon.viewCart();
    System.out.println(amazon.country);
    System.out.println(Shipping.country);//the proper way to access static information in the interface
}
}
