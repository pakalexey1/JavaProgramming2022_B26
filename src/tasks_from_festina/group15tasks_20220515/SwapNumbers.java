package tasks_from_festina.group15tasks_20220515;

public class SwapNumbers {
    public static void main(String[] args) {
        swapNumbers(7,3);
    }
    public static void swapNumbers(int numA, int numB){
        int numC = numA+numB;
        numA=numC-numA;
        numB=numC-numB;

        System.out.println("numA was: "+numB+" and numB was: " +numA + "\nnow numA is: "+numA + " and numB is " +numA );
    }
}

/*
4) Numbers - Swap Numbers
Swap two variable' values without using a third variable
 */
