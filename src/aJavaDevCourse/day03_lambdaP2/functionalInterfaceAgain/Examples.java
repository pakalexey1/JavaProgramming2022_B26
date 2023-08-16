package aJavaDevCourse.day03_lambdaP2.functionalInterfaceAgain;

import java.util.function.Predicate;

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

    }
}
