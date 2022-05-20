package tasks_from_festina.group15tasks_2022may15;

public class DivisionWithoutDividing {

    public static void main(String[] args) {
        System.out.println(divisionWithoutDividing(10,3));
    }

    public static int divisionWithoutDividing (int numA, int numB){
            int numC = numA-numB;
            int count = 0;
        for (int i = 0; i < numA; i++) {

            if (numC>=0){
                numC = numC-numB;
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}


/*
2) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator
 */