package practice_string_and_primitives;

public class Codility {
    public static void main(String[] args) {
        codility(15);
    }

    public static void codility(int N) {

        for (int i = 1; i <= 30; i++) {
            String res = "";
            if (i % 2 == 0) {
                res += "Codility";
            }
            if (i % 3 == 0) {
                res+="Test";
            }
            if (i % 5 == 0) {
                res+="Coders";
            }

            if (i%2 != 0 && i%3!=0 && i%5!=0){
                res+=i+"";
            }
            System.out.println(res);
        }
    }
}
