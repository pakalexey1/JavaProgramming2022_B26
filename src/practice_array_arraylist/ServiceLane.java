package practice_array_arraylist;

import day52_inheritance.hiding.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceLane {
    public static void main(String[] args) {
        List<Integer> width = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3));

        List<List<Integer>> cases = new ArrayList<>();
        cases.add(new ArrayList<>(Arrays.asList(0, 3)));
        cases.add(new ArrayList<>(Arrays.asList(4, 6)));
        cases.add(new ArrayList<>(Arrays.asList(6, 7)));
        cases.add(new ArrayList<>(Arrays.asList(3, 5)));
        cases.add(new ArrayList<>(Arrays.asList(0, 7)));

        System.out.println(serviceLane(cases, width));
    }

    public static List<Integer> serviceLane(List<List<Integer>> cases, List<Integer> width) {

        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < cases.size(); i++) {
            int min = Integer.MAX_VALUE;
            for (int j = cases.get(i).get(0); j < cases.get(i).get(1); j++) {
                if (width.get(j) < min) {
                    min = width.get(j);
                }
            }
            output.add(min);
        }

        return output;
    }
}
/*

Link to task: https://www.hackerrank.com/challenges/service-lane/problem
Note that the parameters in the task example don't make sense, hence the task execution is modified.

Find min value of each segment.
Segment 0: indexes from 0 to 3 of the array width
Segment 1: indexes from 4 to 6 of the array width
Segment 2: indexes from 6 to 7 of the array width
Segment 3: indexes from 3 to 5 of the array width
Segment 4: indexes from 0 to 7 of the array width

STDIN               Function
-----               --------
8 5
2 3 1 2 3 2 3 3     width = [2, 3, 1, 2, 3, 2, 3, 3]
0 3                 cases = [[0, 3], [4, 6], [6, 7], [3, 5], [0, 7]]
4 6
6 7
3 5
0 7
 */