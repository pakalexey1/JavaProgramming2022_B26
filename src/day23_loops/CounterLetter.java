package day23_loops;

public class CounterLetter {
    public static void main(String[] args) {

        String word = "banana";
        char letter = 'o';
        int count = 0;
        for (int i = 0 ; i <word.length(); i++){
            if (word.charAt(i)==letter){
                count++;
            }
        }
        if (count>0) {
            System.out.println(count);
        }else{
            System.out.println("No such letter");
        }
    }
}
