package practice_string_and_primitives;

public class FinRaYetAnotherOne {
    public static void main(String[] args) {
        int a = 60;
        int max = 30;
        finRa(a, max);
        fancyFinRa(a, max);
    }

    public static void finRa(int a, int max) {

        for (int i = 1; i <= max; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void fancyFinRa(int a, int max) {

        String output = "";

        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0){
                output += "FIN";
            }
            if (i % 5 == 0) {
                output += "RA";
            }

            if (i % 5 != 0 && i % 3 != 0){
                output += i + "";
            }
            output+=" ";
        }
        System.out.println(output);
    }
}


//15
//FINRA
//        total number is 30. if num divided by3 and 5 print FINRA,in num divided by 3
//        print FIN,if num divided by 5 print RA