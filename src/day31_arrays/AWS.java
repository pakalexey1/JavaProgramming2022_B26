package day31_arrays;

public class AWS {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east1,us-west1,us-west2,us-west3";

        String[] allZones = zones.split(",");

        for(String eachZone : allZones){
            System.out.println(app + " is deploying on " + eachZone);
        }

    }
}
