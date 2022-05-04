package day24_loops;

public class PracticeCamelCase {
    public static void main(String[] args) {

        String str = "Today is SUNDAY";
        str = str.toLowerCase();
        String output = str.substring(0,1);

       // String firstWord = str.substring(0,str.indexOf(" "));
       // String secondWord = str.substring(str.indexOf(" "),str.lastIndexOf(" "));
       // String lastWord = str.substring(str.lastIndexOf(" "));


        for (int i = 1; i < str.length(); i++){

            /* if (str.charAt(i-1) == ' '){
                output+= str.substring(i,i+1).toUpperCase();

            }else{
                output+=str.charAt(i);
            }
             */
            if(str.charAt(i)==' '){
                str=str.replaceFirst(" "+str.charAt(i+1),(""+str.charAt(i+1)).toUpperCase());
            }
            output+=""+str.charAt(i);
        }

        System.out.println(output.replace(" ",""));

    }
}
