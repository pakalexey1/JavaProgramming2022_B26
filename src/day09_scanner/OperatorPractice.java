package day09_scanner;

public class OperatorPractice {
    public static void main (String[] args) {

        int e=1;
        int f = -e-- + e++ / -e-- * --e;
        //      -1   + 0   / -1   *  -1
        //      -1   +     0      *  -1
        //      -1   +     0
        //      -1

        System.out.println(f);

        System.out.println(true || 5 /0 == 0); // double || executes one side if it's enough, even though 5/0 is an error, it doesn't matter, one of the conditions is true.
       // System.out.println(true | 5 /0 == 0); // this is going to be an error, because there is a single OR |

        System.out.println(false && 5/0==0); // with double && left side is already false, so the whole statement is false, and there is no need to check the right side.
       // System.out.println(false & 5/0==0); // this one runs both sides no matter what

    }
}
