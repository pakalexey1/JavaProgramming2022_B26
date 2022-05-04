package day23_loops;

public class CountHi {
    public static void main(String[] args) {

        String str = "Hi my name is Hibone Fakehimingthi";
        String search = "hi";
        int count = 0;
        str.toLowerCase();


        for (int i = 0; i < str.length()-1; i++){

            if (str.substring(i,(i+2)).equalsIgnoreCase(search)){
                count++;
            }
        }
        System.out.println(count);

        for (int index = 0; index < str.length();index++) {
            if(str.charAt(index) == 'h' && str.charAt(index+1) == 'i'){
                count++;
            }
        }

    }
}

/*

String str = "Hi my name is Hibone Fakehimington";
find how many time you can find "hi"

 */
