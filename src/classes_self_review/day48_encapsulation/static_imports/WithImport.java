package classes_self_review.day48_encapsulation.static_imports;

import java.util.Arrays;
import static java.util.Arrays.*;
import static java.lang.Math.*;
import static my_utilities.StringUtil.reverse;

public class WithImport {
    public static void main(String[] args) {
        int[] a = {4, 12, 4, 12};
        sort(a);

        System.out.println(PI);
        System.out.println(abs(-1));
        System.out.println(reverse("apple"));
    }
}
