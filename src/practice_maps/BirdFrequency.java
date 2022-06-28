package practice_maps;

import java.util.*;


public class BirdFrequency {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 4, 4, 4, 5, 3));
        System.out.println(migratoryBirds(arr));
    }

    public static int migratoryBirds(List<Integer> arr) {

        int count = 0;
        int highestFrequency = Integer.MIN_VALUE;
        int result = 0;
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {

            if (frequency.containsKey(arr.get(i))) {
                count = frequency.get(arr.get(i));
                frequency.put(arr.get(i), count + 1);
                if (highestFrequency < frequency.get(arr.get(i))) {
                    highestFrequency = frequency.get(arr.get(i));
                    result = arr.get(i);
                }
            } else {
                frequency.put(arr.get(i), 1);
            }
        }

        return result;
    }
}

/*
Link to task: https://www.hackerrank.com/challenges/migratory-birds/problem

Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

Example

    There are two each of types  and , and one sighting of type . Pick the lower of the two types seen twice: type .

Function Description

    Complete the migratoryBirds function in the editor below.

    migratoryBirds has the following parameter(s):

    int arr[n]: the types of birds sighted
Returns

    int: the lowest type id of the most frequently sighted birds
Input Format

    The first line contains an integer, , the size of .
    The second line describes  as  space-separated integers, each a type number of the bird sighted.

Constraints

    It is guaranteed that each type is , , , , or .
 */