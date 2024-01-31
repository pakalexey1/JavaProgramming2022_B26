package practice_string_and_primitives;

public class FinRaYesAnotherOne {
    public static void main(String[] args) {
//        finRa(30);
//        finRa3(30);
        finRaStrBldr3(30);
    }

    public static void finRa(int num) {
        String output = "";
        for (int i = 0; i <= num; i++) {

            if (i % 5 == 0) {
                output += "Fin";
            }
            if (i % 3 == 0) {
                output += "Ra";
            }
            if (i % 3 != 0 && i % 5 != 0) {
                output += i + "";
            }
            output+="\n";

        }
        System.out.println(output);
    }

    public static void finRaRa(int num){

        String output = "";
        for (int i = 0; i <= num; i++) {
        if (i%5==0){
            output+="Fin";
        }
        if (i%3==0){
            output+="Ra";
        }
        if (i%5!=0 && i%3!=0){
            output+=i+"";
        }
        output+="\n";
        }
        System.out.println(output);
    }
    
    public static void finRa2(int num){
        String output = "";
        for (int i = 0; i <= num; i++) {
            if (i%5==0){
                output+="Fin";
            }
            if (i % 3 == 0) {
                output+="Ra";
            }
            if (i%5!=0 && i%3!=0){
                output+=i+"";
            }
            output+="\n";
            System.out.println(output);
        }
    }

    public static void finRa3(int num){
        StringBuilder output = new StringBuilder();
        for (int i = 0; i <= num; i++) {
            if (i%5==0){
                output.append("Fin");
            }
            if (i%3==0){
                output.append("Ra");
            }
            if (i%3!=0 && i%5!=0){
                output.append(i);
            }
            output.append("\n");
        }
        System.out.println(output);
    }

    public static void finRaStr1(int num){
        String output = "";
        for (int i = 0; i <= num; i++) {
            if (i%5==0){
                output+="Fin";
            }
            if (i%3==0){
                output+="Ra";
            }
            if (i%3!=0 & i%5!=0){
                output+=i+"";
            }
            output+="\n";
        }
        System.out.println(output);
    }

    public static void finraStrBldr2(int num){
        StringBuilder output = new StringBuilder();

        for (int i = 0; i <=num; i++) {
            if (i%5==0){
                output.append(i);
            }
            if (i%3==0){
                output.append(i);
            }
            if (i%3!=0 && i%5 != 0){
                output.append(i);
            }
            output.append("\n");
        }
        System.out.println(output);
    }

    public static void finRaStrBldr3(int num){

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= num; i++) {
            if (i%5==0){
                builder.append("Fin");
            }
            if (i % 3 == 0) {
                builder.append("Ra");
            }
            if (i%5!=0 && i%3!=0){
                builder.append(i);
            }
            builder.append("\n");
        }

        System.out.println(builder);
    }
}

//15
//FINRA
//        total number is 30. if num divided by3 and 5 print FINRA,in num divided by 3
//        print FIN,if num divided by 5 print RA