package day30_arrays;

import java.util.Arrays;

public class PracticeAWS {
    public static void main(String[] args) {
        String zone = "us-east-1,us-west-1,us-west-2,us-west-3";
        String app = "etsy";

        String[] zoneArr = zone.split(",");
       // System.out.println(Arrays.toString(zoneArr));

        for (String word : zoneArr) {
            System.out.println("Deploying " + app + " to " + word);
            System.out.println("Deployment completed for " + word);
            //Deploying etsy to us-east-1...
            //Deployment completed for us-east-1
        }
    }
}
/*
AWS Zones

Given an app name and a String of zones in the following format
	us-east-1,us-west-1,us-west-2,us-west-3
	print the app deploying to each zone

Ex:
	app = etsy
    zones = us-east-1,us-west-2,us-west-1
    output:
		Deploying etsy to us-east-1...
		Deployment completed for us-east-1

		Deploying etsy to us-west-1...
		Deployment completed for us-west-1

		Deploying etsy to us-west-2...
		Deployment completed for us-west-2
 */
