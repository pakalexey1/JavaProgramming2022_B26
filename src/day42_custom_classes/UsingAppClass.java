package day42_custom_classes;

import java.util.Scanner;

public class UsingAppClass {
    public static void main(String[] args) {

        App cydeo = new App();
        cydeo.name = "Cydeo";
        cydeo.version=5.5;
        cydeo.isFree=true;

//        we can't call instance methods like this:'
//        App.run();
//        App.update()

        cydeo.run();
        cydeo.update();

        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);
        System.out.println(cydeo);

        new App().run(); // this creates an object with no references and calls the run method

        new Scanner(System.in).nextLine(); // no "input" variable, so it's one time use

    }

}
