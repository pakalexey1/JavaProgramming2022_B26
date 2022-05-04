package day22_loops;

public class ReplitUotpianTree {
    public static void main(String[] args) {

        int year = 0;
        int growth = 1;
        int treeSize = 0;

        while (year <=10) {
            year++;
            if (year >=1 && year <=3){
                growth = 1;
                treeSize+=growth;
                System.out.println("year "+ year + " - growth "+ growth + " cm");
                System.out.println("tree size: " + treeSize + " cm");
            }
            if (year >=4 && year <=10) {
                growth=2;
                treeSize+=2;
                System.out.println("year "+ year + " - growth "+ growth + " cm");
                System.out.println("tree size: " + treeSize + " cm");
            }
        }
    }
}
