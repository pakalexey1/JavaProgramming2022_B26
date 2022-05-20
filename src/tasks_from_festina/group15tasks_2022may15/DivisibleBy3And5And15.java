package tasks_from_festina.group15tasks_2022may15;

public class DivisibleBy3And5And15 {
    public static void main(String[] args) {
        divisibleBY3515();
    }
    public static void divisibleBY3515() {
        String div15 = "Divisible by 15: ";
        String div3 = "Divisible by 3: ";
        String div5 = "Divisible by 5: ";

        for (int i = 1; i < 100; i++) {

            if (i % 15 == 0) {
                div15 += i + " ";
            } else if (i % 5 == 0) {
                div5 += i + " ";
            } else if (i % 3 == 0){
                div3+=i+" ";
            }
        }
        System.out.println(div15+"\n"+div5+"\n"+div3);
    }
}
