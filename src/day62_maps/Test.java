package day62_maps;

import java.util.ArrayList;
import java.util.Arrays;

public class Test  {
    public static void main(String[] args) {

        ArrayList<String> output = new ArrayList<>(Arrays.asList("1","DC","501","GCCCA","098911","a"));
        System.out.println(output);

        String[] arrToSort = (output.get(2).split(""));
        System.out.println(Arrays.toString(arrToSort));
        Arrays.sort(arrToSort);
        String tempStr ="";
        System.out.println(Arrays.toString(arrToSort));
        for (int j = 0; j < arrToSort.length; j++) {
            tempStr+=arrToSort[j];
//            tempStr="";
        }
        System.out.println(tempStr);
        output.add(tempStr);
        System.out.println(output);
    }
}
