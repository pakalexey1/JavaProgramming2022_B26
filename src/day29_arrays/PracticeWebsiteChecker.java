package day29_arrays;

public class PracticeWebsiteChecker {
    public static void main(String[] args) {

        String [] website = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com",
                "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com",
                "comcast.net", "tamu.edu", "utexas.edu"};
        int countCom = 0;
        int countOrg = 0;
        int countEdu = 0;
        int countOther = 0;

        for (int i = 0; i < website.length; i++) {

            if (website[i].substring(website[i].indexOf(".")+1).equalsIgnoreCase("com")){
                countCom++;
            }else if (website[i].substring(website[i].indexOf(".")+1).equalsIgnoreCase("org")){
                countOrg++;
            }else if (website[i].substring(website[i].indexOf(".")+1).equalsIgnoreCase("edu")){
                countEdu++;
            }else {
                countOther++;
            }
        }
        System.out.println("There are "+ countCom + " .com websites in the array");
        System.out.println("There are "+ countOrg + " .org websites in the array");
        System.out.println("There are "+ countEdu + " .edu websites in the array");
        System.out.println("There are "+ countOther  + " other websites in the array");
    }
}
