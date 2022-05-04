package day30_arrays;

import java.util.Arrays;

public class PracticeURLParts {
    public static void main(String[] args) {
        String url = "https://learn.cydeo.com/courses/130";

        String[] urlArr = url.split("/");
        //System.out.println(Arrays.toString(urlArr));
        for (int i = 0; i < urlArr.length; i++) {
            System.out.println(urlArr[i]);
        }
    }
}
/*
URL Parts
Given a url as follows, print each section of the url separated by the forward slash /
	Example:
		url = https://learn.cydeo.com/courses/130
	output:
		https:

		learn.cydeo.com
		courses
		130
 */