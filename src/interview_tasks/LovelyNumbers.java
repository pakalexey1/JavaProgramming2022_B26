package interview_tasks;

public class LovelyNumbers {

    public static void main(String[] args) {
        System.out.println(lovely("1234"));
    }

    public static int lovely(String test) {
        int[] count = new int[10];
        for (int i = 0; i < test.length(); i++) {
            int num = Integer.parseInt("" + test.charAt(i));
            count[num]++;
        }
        for (int element : count) {
            if (element > 2) {
                return 1;
            }
        }
        return 0;
    }
}




/*
     We consider a number to be lovely if it contains fewer than
               three instances of any distinct digit (in decimal representation).

                    Examples of lovely numbers: 0, 100, 1232 and 9922;
                    Examples of numbers that are not lovely:
                               1000 (contains three copies of digit '0'),
                               33533 (contains four copies of digit '3').

                       Examples:
                       lovelyNumber(0)    ---returns true
                       lovelyNumber(100)  ---returns true
                       lovelyNumber(111)  ---returns false
                       lovelyNumber(1232) ---returns true
                       lovelyNumber(9922) ---returns true
                       lovelyNumber(99922)---returns false

                       In your solution, focus on correctness. The performance of your
                       solution will not be the focus of the assessment.
     */