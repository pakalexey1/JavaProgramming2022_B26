package classes_self_review.day45_custom_classes;

import classes_self_review.day44_custom_classes.employee.Offer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer first = new Offer("Texas", "Google", 200_000, true, 15);
//        System.out.println(first);

        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(first);
//        System.out.println(allOffers);

        allOffers.add(new Offer("New York","Amazon",100_000, true, 12));

        System.out.println(allOffers);

        Offer [] moreOffers = {
                new Offer ("Chicago","Apple",230000,false,10),
                new Offer("Texas","Tesla", 240000,false,20),
                new Offer ("Florida","Facebook",120000,true, 10)
        };
        allOffers.addAll(Arrays.asList(moreOffers));
        System.out.println(allOffers);

        allOffers.addAll(Arrays.asList(
                new Offer("Chicago","Discord",123000,true, 10),
                new Offer("Quebec","Netlfix",150000,true,12)
        ));
        System.out.println(allOffers);

        ArrayList<Offer> salaries = new ArrayList<>(allOffers);
        salaries.removeIf(each -> each.salary < 170000);
        System.out.println("Salaries above 170000");
        System.out.println(salaries);
    }
}
