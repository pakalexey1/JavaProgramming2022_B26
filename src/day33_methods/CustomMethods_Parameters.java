package day33_methods;

public class CustomMethods_Parameters {
    public static void displayValue(int num){
        System.out.println("The value is: " + num);
    }

    public static void eligibleToVote(int age, boolean isUsCitizen){
        if (age>=21 && isUsCitizen){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void oddOrEven(int number){
        if (number%2 == 0){
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }
    }

    public static void main(String[] args) {
        displayValue(10);
        System.out.println("==========================");
        eligibleToVote(23,true);

        oddOrEven(-100);
    }



}
