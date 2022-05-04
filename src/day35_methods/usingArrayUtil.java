package day35_methods;

import my_utilities.ArrayUtil;

public class usingArrayUtil {

    public static void main(String[] args) {
        int [] a = {1,5,6,85,5,58,8};
        System.out.println(ArrayUtil.minNumberSort(a));
        System.out.println(ArrayUtil.maxNumber(a));
        System.out.println(ArrayUtil.doesContain(a,5));

    }

}
