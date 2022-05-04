package day45_custom_classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsePracticeHobby {
    public static void main(String[] args) {

        ArrayList<PracticeHobby> allHobbies = new ArrayList<>(Arrays.asList(

                new PracticeHobby("painting"),
                new PracticeHobby("crafting", 1000),
                new PracticeHobby("kayaking", 1200, true, true)
        ));

        System.out.println(allHobbies);

        for (PracticeHobby each : allHobbies) {
            each.doIt();
        }

        allHobbies.addAll(List.of(new PracticeHobby("cycling", 100, false, false)
        ));

        System.out.println("=========================");
        ArrayList<PracticeHobby> removeOutDoors = new ArrayList<>(allHobbies);
        removeOutDoors.removeIf(each -> each.isOutDoors == null || each.isOutDoors);
        System.out.println(removeOutDoors);

        System.out.println("=========================");
        ArrayList<PracticeHobby> removeOtherPeople = new ArrayList<>(allHobbies);
        removeOtherPeople.removeIf(each -> each.requiresOthers == null || each.requiresOthers);
        System.out.println(removeOtherPeople);

        System.out.println("==========================");
        ArrayList<PracticeHobby> cheap = new ArrayList<>(allHobbies);
        cheap.removeIf(each -> each.annualCost >500);
        System.out.println(cheap);


    }
}
