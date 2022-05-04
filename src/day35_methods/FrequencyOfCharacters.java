package day35_methods;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacter("Abracadabra",'a'));
    }

    public static int frequencyOfCharacter(String str, char letter){
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==letter){
                count++;
            }
        }
        return count;
    }
}
