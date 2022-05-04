package codingBatWarmup1;

public class parrotTrouble {

    public static void main(String[] args) {
        System.out.println(parrotTrouble(false,7));
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (hour >= 0 && hour <= 23) {
            if (talking && (hour < 7 || hour > 20)) {
               return true;
            }
        }
        return false;
    }
}


/*

We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.


parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false

 */