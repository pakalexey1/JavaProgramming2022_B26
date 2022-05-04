package day22_loops;

public class ZombieAttack {
    public static void main(String[] args) {

        int inhabitants = 6;
        int day = -1;

        while (inhabitants > 0) {
            day++;
            System.out.println("Day " + day + "" + " [" + inhabitants + "]");
            inhabitants = inhabitants / 2;
        }
        System.out.println("---- EXTINCT ----");
    }
}
