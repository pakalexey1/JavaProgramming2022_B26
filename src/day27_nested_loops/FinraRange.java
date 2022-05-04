package day27_nested_loops;

public class FinraRange {
    public static void main(String[] args) {

        int stop = 15;

        for (int i = 1; i <= stop; i++) {
            String str = "";

            if (i % 3 == 0) {
                str += "FIN";
            }
            if (i % 5 == 0) {
                str += "RA";
            }
            System.out.println(str.isEmpty() ? i : str);
        }
    }
}

/*

if num:
    %3 = fin
    %5 = ra
    %3 && %5 == finra

 */