package aJavaDevCourse.week03_lambdaP2.fucntionalInterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {

        //*****************PREDICATE**********************//

        //Anonymous class:
//        Predicate<Integer> lesserThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer < 18;
//            }
//        };
//
//        lesserThan.test(50);


//        Predicate<Integer> lesserThan = public boolean abc (Integer a){
//            return a<18;
//        }

        //The method above, to the right of "=" becomes a lambda expression below:

        Predicate<Integer> lesserThan = b-> b<18; // Implementation of test method that belongs
                                                  // to a Predicate Interface boolean test(T t);
        Boolean result = lesserThan.test(50);
        System.out.println(result);

        //*******************CONSUMER*******************//

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50);

        //*******************BICONSUMER*******************//
        BiConsumer<Integer,Integer> addTwoInts = (x,y) -> System.out.println(x+y);
        addTwoInts.accept(12,13);

        //*******************FUNCTION*******************//
        Function<String,String> fun = s -> "Hello " + s;
        String str = fun.apply("Ozzy");
        System.out.println(str);

        System.out.println(fun.apply("Alex"));

        //*******************SUPPLIER*******************//
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
    }
}
