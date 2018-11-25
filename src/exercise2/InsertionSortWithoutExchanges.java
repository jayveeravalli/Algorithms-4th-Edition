package exercise2;

import section2.Sort;

import java.util.Arrays;

public class InsertionSortWithoutExchanges{

    public static void sort(Object[] a) {
        for (int i = 1; i < a.length; i++){
            Object temp = a[i];
            int j = i - 1;

            while (j>=0 && ((Comparable) temp).compareTo(a[j]) < 0 ) {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = temp;
        }
    }

}
