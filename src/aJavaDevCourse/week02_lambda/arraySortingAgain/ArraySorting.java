package aJavaDevCourse.week02_lambda.arraySortingAgain;

public class ArraySorting {
    public static void main(String[] args) {
        SortingClass as = new SortingClass();
//        as.sort();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        as.sort(qs);
        as.sort(bs);
    }


}
