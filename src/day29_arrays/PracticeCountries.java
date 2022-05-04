package day29_arrays;

import java.util.Arrays;

public class PracticeCountries {
    public static void main(String[] args) {

        String [] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States"};
        String [] firstLast = new String [countries.length];

        for (int i = 0; i < countries.length; i++) {
            firstLast[i] = countries[i].substring(0,1) + countries[i].substring(countries[i].length()-1).toUpperCase();
        }
        System.out.println(Arrays.toString(firstLast));

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].substring(countries[i].length()-1).equalsIgnoreCase("a")){
                System.out.println(countries[i]);
            }
        }

        String containsCountry = "china";
        boolean doesContain = true;

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equalsIgnoreCase(containsCountry)){
                doesContain = true;
            }else {
                doesContain = false;
            }
        }
        if (doesContain){
            System.out.println(containsCountry + " is in the array");
        }else{
            System.out.println(containsCountry + " is not in the array");
        }


    }
}


/*Given a String array of countries:
String[] countries = {
"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
"Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
"Honduras", "Indonesia", "United States"
};
- Find and print all the first and last characters of each country
- Find and print all the countries that end with the letter ‘a’
- Create “contains logic” to check if there is a certain country in the array. Can check for
the United States, or use Scanner to check any country

 */