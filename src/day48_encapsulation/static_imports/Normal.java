package day48_encapsulation.static_imports;

import my_utilities.StringUtil;

import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {
        int[] a = {4, 12, 5, 25};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Math.PI); // this variable is static, because I don't need to create an object to access it

        System.out.println(Math.abs(-1));

        System.out.println(StringUtil.reverse("abrakadabra"));
    }
}
