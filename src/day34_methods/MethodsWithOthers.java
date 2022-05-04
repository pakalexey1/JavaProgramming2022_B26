package day34_methods;

public class MethodsWithOthers {
    public static String dayInWords(int day) {

        String strDay = "";
               /*
        switch (day){
            case 1:
                strDay = "Monday";
                break;
            case 2:
                strDay = "Tuesday";
                break;
            case 3:
                strDay = "Wednesday";
                break;
            case 4:
                strDay = "Thursday";
                break;
            case 5:
                strDay = "Friday";
                break;
            case 6:
                strDay = "Saturday";
                break;
            case 7:
                strDay = "Sunday";
                break;
            default:
                strDay="Invalid day";
        }
        return strDay;


        the same way with directly assigning the output to return
        */
        switch (day) {
            case 1:
                return "Monday";//no need break as return terminates the code execution
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid day";
        }
    }

    public static int firstEvenNumber(int[] nums) {
        for (int num : nums) {
            if (num % 2 == 0) {
                return num;
            }
        }
        return 0; // in case there is no even number in the array, and you can't put else, because it would stop the loop after the first number not being even
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 7, 7, 3, 9};
        System.out.println(firstEvenNumber(arr));
    }

}

