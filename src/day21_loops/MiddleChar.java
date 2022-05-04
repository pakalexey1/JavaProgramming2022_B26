package day21_loops;

public class MiddleChar {
    public static void main(String[] args) {

        String s = "abcdef";
                  //012345

        if (s.length() % 2 == 0){
            char firstMiddle = s.charAt(s.length()/2 - 1);
            char secondMiddle = s.charAt(s.length()/2);
            System.out.println("With charAt: "+firstMiddle+secondMiddle);
            System.out.println("With substring: " + s.substring(s.length()/2 - 1, s.length()/2+1));

        } else{
            char middle = s.charAt(s.length()/2);
            System.out.println("With chartAt: " + middle);

            String middleStr = s.substring(s.length()/2,s.length()/2+1);
            System.out.println("With String: " + middleStr);
        }

    }
}
