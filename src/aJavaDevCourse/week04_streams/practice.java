package aJavaDevCourse.week04_streams;

public class practice {
    public static void main(String[] args) {
        String str = "aksljd23lk3";
        System.out.println(sumOfDigits(str));

    }

    public static int sumOfDigits(String str){
//        List<Integer> output = new ArrayList<>();
        Integer temp = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
              temp +=Integer.parseInt(str.charAt(i)+"");
            }

        }
        return temp;
    }
}
