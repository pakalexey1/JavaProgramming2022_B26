package day20_string;

public class ReplitBurgerChicken {
    public static void main(String[] args) {

        String order = "Chicken";

        order.toLowerCase();

        if (order.contains("chicken")){
            System.out.println("Your total is $9.75");
        }else {
            System.out.println("Your total is $12.50");
        }

        String word1 = "b";
        String word2 = "shmord";

        if (word1.length()>word2.length()){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }
        boolean isJava = true;
        if (word1.length()>=4) {
            if (word1.substring(0, 4).equals("java") || word1.substring(1, 5).equals("java")) {
                System.out.println(isJava);
            } else {
                System.out.println(!isJava);
            }
        } else {
            System.out.println(!isJava);
        }



    }
}
