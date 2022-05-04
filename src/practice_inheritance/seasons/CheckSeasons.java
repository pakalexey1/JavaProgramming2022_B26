package practice_inheritance.seasons;

public class CheckSeasons {

    public static void main(String[] args) {
        Winter winter1 = new Winter(45.5, 25.4);
        System.out.println(winter1);
        winter1.activity();

        Summer summer1 = new Summer(105.2,68.3);
        System.out.println(summer1);
        summer1.activity();

        Fall fall1 = new Fall(80.8, 50.7);
        System.out.println(fall1);
        fall1.activity();

        Spring spring1 = new Spring(75.9,35.3);
        System.out.println(spring1);
        spring1.activity();







    }
}

/*
Create a class CheckSeason

	create an object of Winter, Summer, Fall and Spring and verify if constructor, toString(), and activity() are working properly for each class

	List the is a relations of all the classes
 */