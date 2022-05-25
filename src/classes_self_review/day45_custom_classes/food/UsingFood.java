package classes_self_review.day45_custom_classes.food;

import java.util.Arrays;

public class UsingFood {
    public static void main(String[] args) {
        food chicken = new food("chicken",3,5.99);
        System.out.println(chicken);

        food apples = new food("apples", 2, 1.2);

        food lays = new food("lays",5, 2.1);

        food[] foods= {apples,chicken,lays,null};
        System.out.println(foods[2]); //prints element 2 of the array

        foods[3] = new food("fish", 3, 12.33);
        System.out.println(Arrays.toString(foods));

        double totalPriceAll = 0;
        for(food each : foods){
            System.out.println(each);
            totalPriceAll+=each.totalPrice;
        }
        System.out.println(totalPriceAll);

    }
}
