package day06_RecapOfDay05;

public class HomeWork {
    public static void main(String[] args) {
        String FULL_NAME, COMPANY_NAME, FIRST_NAME, LAST_NAME, FULL_START_DATE, EMAIL,JOB_TITLE, ADDRESS;

        int $SALARY, START_DAY, START_MONTH, START_YEAR;
        double $SALARY_2_YEARS;

        FIRST_NAME= "Noah";
        LAST_NAME="Smith";
        COMPANY_NAME="Apple";
        ADDRESS="One Apple Park Way, Cupertino, CA 95014";
        JOB_TITLE="SDET";

        boolean IS_FULL_TIME=true;

        START_DAY=10;
        START_MONTH=1;
        START_YEAR=2022;
        $SALARY=200_000;
        FULL_NAME=FIRST_NAME+" "+LAST_NAME;
        FULL_START_DATE= START_MONTH+" "+START_DAY+", "+START_YEAR;
        EMAIL=FIRST_NAME+START_DAY+"@"+COMPANY_NAME+".com";
        $SALARY_2_YEARS=$SALARY*1.15+1;

        System.out.println("Employee Information\nWe have "+FULL_NAME+" joining "+COMPANY_NAME+"\n"+FIRST_NAME+" will start on "+FULL_START_DATE+" as full time: "+IS_FULL_TIME+"\n"+FIRST_NAME+" here is some information about your employment\nYour email is "+EMAIL+"\n"+"Your base salary is "+$SALARY+" and after 2 years it will be "+(int)$SALARY_2_YEARS+"\n"+"Welcome aboard, see you at "+ADDRESS);
    }
}
