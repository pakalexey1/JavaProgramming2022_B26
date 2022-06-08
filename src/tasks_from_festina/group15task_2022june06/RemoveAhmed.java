package tasks_from_festina.group15task_2022june06;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {
    public static void main(String[] args) {
        ArrayList<String> ahmed = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Mike"));
        System.out.println(removeAhmed(ahmed));
    }
    public static ArrayList<String> removeAhmed(ArrayList<String> stringArrayList){

        ArrayList<String> noAhmed = new ArrayList<>();
        for (int i = 0; i < stringArrayList.size(); i++) {
            if (!stringArrayList.get(i).equals("Ahmed")){
                noAhmed.add(stringArrayList.get(i));
            }
        }
        return noAhmed;
    }
}
/*
25) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */