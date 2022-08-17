package practice_string_and_primitives;

public class ReplaceOwithA {
    public static void main(String[] args) {
        String str = "OsOdjjoSsh";
        System.out.println(replaceOWithA(str));
    }

    public static String replaceOWithA(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'O' || str.charAt(i) == 'o') {
                count++;
            }
        }
        if (count == 3 || count == 4) {
            str = str.replaceAll("O", "a").replaceAll("o", "a");
        }

        return str;
    }
}


//    //77
//    String str ="OsOdjjOssh";
//       replace "o" with "a" only the number of o is 3 or 4
//               asadjjassh <  BECAUSE THERE IS 3 O