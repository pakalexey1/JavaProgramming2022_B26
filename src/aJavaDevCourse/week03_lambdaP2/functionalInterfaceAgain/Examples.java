package aJavaDevCourse.week03_lambdaP2.functionalInterfaceAgain;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {
        //************Predicate**************//

//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//        lesserThan.test(50);

        //Regular method:
//        Predicate<Integer> lesserThan = public boolean abc (Integer a){
//            return a<18;
//        }

        //Lambda way:
        Predicate<Integer> lesserThan = a-> a<18;
        Boolean result = lesserThan.test(50);
        System.out.println(result);

        //*************Consumer*****************//
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50);


        //*************BiConsumer*****************//
        BiConsumer<Integer,Integer> addTwo = (x,y)-> System.out.println(x+y);
        addTwo.accept(100,200);


        //*************Function*****************//
        Function<String,String> funct = s -> "Hello " + s;
        String str = funct.apply("Alex");
        System.out.println(str);


        //*************Supplier*****************//
        Supplier<Double> supplr = () -> Math.random();
        System.out.println(supplr.get());

    }
}
